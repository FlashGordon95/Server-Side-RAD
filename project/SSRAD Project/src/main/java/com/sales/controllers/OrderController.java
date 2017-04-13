package com.sales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		model.addAttribute("AllOrders", orderServ.getProducts());
		return "allOrders";
	}
	
}
