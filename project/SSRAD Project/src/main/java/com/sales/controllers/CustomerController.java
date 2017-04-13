package com.sales.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Customer;
import com.sales.services.CustomerService;
import com.sales.services.ProductService;

/**
 * CustomerController 
 * A class for the Customer Model. Handles the mappings and business logic for customers
 * for retrieving customers from the DB, adding new items to the DB and updating existing items.
 * 
 * @author Ryan Gordon
 *
 */
@RequestMapping("/secure/customers/")
@Controller
public class CustomerController {
	
	
	@Autowired
	@Qualifier("CustService")
	CustomerService custServ;
	
	
	@GetMapping(value = "/showCustomers")
	public String getAllCustomers(Model model){
		model.addAttribute("AllCustomers", custServ.getCustomers());
		return "allCustomers";
	}
	
	/**
	 * The GET for route /addCustomer
	 * Creates a form modelled with customer
	 * and returns the form
	 * @param model
	 * @return jsp page
	 */
	@GetMapping(value = "/addCustomer")
	public String getCustomer(Model model){
		// Create a model for the form
		Customer cust = new Customer();
		model.addAttribute("Customer", cust);
	
		
		return "addCustomer";
	}
	/**
	 * The POST for route /addCustomer
	 * Attempts to add the cust to the DB
	 * If there are errors it will return to the addCustomer page and show errors
	 * @param model
	 * @return jsp page
	 */
	@RequestMapping(value = "/addCustomer",method=RequestMethod.POST)
	public String submitCustomer(@Valid @ModelAttribute ("Customer") Customer cust, BindingResult result){
		//Try to add to DB
		custServ.addCust(cust);
		System.out.println(cust.toString());
		//If problem with DB go back to addCustomer page
		if (result.hasErrors()) {
			return "addCustomer";
		}
		//If successful redirect to showCustomers page
		return "redirect:showCustomers";
	}
}