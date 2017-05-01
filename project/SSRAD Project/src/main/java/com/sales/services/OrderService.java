package com.sales.services;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.exceptions.NotCIdException;
import com.sales.exceptions.NotPIdException;
import com.sales.exceptions.NullCIdException;
import com.sales.exceptions.NullPIdException;
import com.sales.exceptions.QtyException;
import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.models.Product;
import com.sales.repositories.CustomerDAO;
import com.sales.repositories.OrderDAO;
import com.sales.repositories.ProductDAO;
/**
 * OrderService
 * A service class which consumes a DAO interface for orders.
 * Encapsulates the process for retrieving orders from the DB, 
 * adding new items to the DB and updating existing items.
 * 
 * @author Ryan Gordon
 *
 */

@Service("OrderService")
public class OrderService {

	@Autowired
	private OrderDAO repo;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	private Customer cust;
	private Product prod;
	
	//Set up our date format
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	//Initialise a new date object
	private Date date = new Date();
	
	
	public void addOrder(Order order) throws NullCIdException, NullPIdException, NotCIdException , NotPIdException , QtyException{
		
		
		cust=order.getCust();
		prod=order.getProd();
		/**
		 * Firstly we need to check if the user enter values for customer and product.
		 * If they did not. Raise the appropiate error.
		 */
		if (cust.getcId() == null) {
			
			throw new NullCIdException("No Customer entered");
		} else if (prod.getpId() == null) {
		

			throw new NullPIdException("No Product entered");
		}
		/**
		 * Now well will check to repo for our customers if we have values provided
		 * If a cust or a product is not found , raise an appropiate error
		 */		
		cust = customerDAO.findOne(order.getCust().getcId());
		prod = productDAO.findOne(order.getProd().getpId());
			
			
		if  (cust==null) {
			
			throw new NotCIdException("No such customer:"+cust.getcId());
		} else if (prod==null) {
			
			throw new NotPIdException("No Such Product :"+order.getProd().getpId()+" or no such customer:"+order.getCust().getcId());
		}
		/**
		 * Lastly if a product and cust is found with the info, check the stock vs how much cust wants. 
		 * If not enough stock , return appropiate error
		 */
		else if (order.getQty() > prod.getQtyInStock()) {
			throw new QtyException("Not enough stock ");
		}
		
		
		/**
		 * If all Ok, perform the business logic required by the spec and save to the DB
		 */
		else{
			//Decrement the products stock by the order amount
			prod.setQtyInStock(prod.getQtyInStock() - order.getQty());
			
			//Set the order date to todays date
			order.setOrderDate(dateFormat.format(date));
			//Set order cust name to our matched cust 
			order.getCust().setcName(cust.getcName());
			//Set order description to our order 
			order.getProd().setpDesc(prod.getpDesc());
			
			//Initiate a save to the DAO
			repo.save(order);
		}//end else
		
	}//end addOrder
		
	
	public ArrayList<Order> getOrders(){
		System.out.print("Tring to retreive products from DB");
		return (ArrayList<Order>) repo.findAll();
	}

}



