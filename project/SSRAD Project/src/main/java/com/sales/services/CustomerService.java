package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.models.Product;
import com.sales.repositories.CustomerDAO;
import com.sales.repositories.OrderDAO;
import com.sales.repositories.ProductDAO;

/**
 * CustomerService
 * A service class which consumes a DAO interface for customers.
 * Encapsulates the process for retrieving customers from the DB, 
 * adding new items to the DB and updating existing items.
 * 
 * @author Ryan Gordon
 *
 */

@Service("CustService")
public class CustomerService {

	@Autowired
	private CustomerDAO repo;
	
	@Autowired
	private OrderDAO orderRepo;
	
	private ArrayList<Customer> customers;
	public void addCust(Customer c){
		try {
			repo.save(c);
			
		} catch (Exception exc) {
			
		}
	}
		
	
	public ArrayList<Customer> getCustomers(){
		System.out.print("Tring to retreive products from DB");
		customers = (ArrayList<Customer>) repo.findAll();
		
		//Iterate over the list of customers to get each of their orders
		for(Customer cust : customers){
			cust.setOrders(getCustomersOrders(cust));
		}
		
		return (ArrayList<Customer>) customers;
	}
	
	public ArrayList<Order> getCustomersOrders(Customer cust){
		System.out.print("Trying to get customer orders now \n\n\n\n\n\n\n");
		//Query the order DB for Orders the specified cust has made.
		return (ArrayList<Order>) orderRepo.findBycust(cust);
	}

}



