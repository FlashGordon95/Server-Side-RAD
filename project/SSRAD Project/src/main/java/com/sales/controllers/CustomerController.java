package com.sales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}