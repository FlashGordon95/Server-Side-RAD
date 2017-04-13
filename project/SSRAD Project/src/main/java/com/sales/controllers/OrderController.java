package com.sales.controllers;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Order;
import com.sales.models.Product;
import com.sales.services.OrderService;
import com.sales.services.ProductService;

/**
 * OrderController 
 * A class for the Order Model. Handles the mappings and business logic orders
 * for retrieving orders from the DB, adding new items to the DB and updating existing items.
 * 
 * @author Ryan Gordon
 *
 */
@RequestMapping("/secure/orders/")
@Controller
public class OrderController {
	
	@Autowired
	@Qualifier("OrderService")
	OrderService orderServ;

	@GetMapping(value = "/showOrders")
	public String getAllCustomers(Model model){
		model.addAttribute("AllOrders", orderServ.getOrders());
		return "allOrders";
	}
	
	/**
	 * The GET for route /addOrder
	 * Creates a form modelled with Order
	 * and returns the form
	 * @param model
	 * @return jsp page
	 */
	@GetMapping(value = "/addOrder")
	public String getProduct(Model model){
		// Create a model for the form
		Order prod = new Order();
		model.addAttribute("Order", prod);
	
		
		return "addOrder";
	}
	/**
	 * The POST for route /addOrder
	 * Attempts to add the Order to the DB
	 * If there are errors it will return to the addProduct page and show errors
	 * @param model
	 * @return jsp page
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/addOrder",method=RequestMethod.POST)
	public String submitProduct(@Valid @ModelAttribute ("Order") Order order, BindingResult result,HttpServletRequest request) throws SQLException{
		
		//Set up our date format
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//Initialise a new date object
		Date date = new Date();
		//Add it to our order
		order.setOrderDate(dateFormat.format(date));
		
		if(order.getQty() > order.getProd().getQtyInStock()){
			System.out.println("\n\n\n\n\n\n\n\n\n We have a problem, too much ordered not enough product in stock!");
			
			//Redirect the user to an error page
			request.setAttribute("prodId", order.getProd().getpId());
	        request.setAttribute("custId", order.getCust().getcId());
	        request.setAttribute("qty", order.getQty());
	        

	        
	       
				throw new SQLException();
			
		}
		//Check if the Prod ID exists in the product table
		
		
		//Check if the Cust ID exists in the custs table
		
		
		
		
		//Try to add to DB
		orderServ.addOrder(order);
		System.out.println(order.toString());
		//If problem with DB go back to addCustomer page
		if (result.hasErrors()) {
			return "addOrder";
		}
		//If successful redirect to showCustomers page
		return "redirect:showOrders";
	}
	
	
	
	// Specify name of a specific view that will be used to display the error:
    @ExceptionHandler({SQLException.class})
    public String databaseError() {
      return "databaseError";
    }

}
