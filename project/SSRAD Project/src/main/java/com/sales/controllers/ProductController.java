package com.sales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sales.services.ProductService;
/**
 * ProductController 
 * A class for the Product Model. Handles the mappings and business logic for products
 * for retrieving products from the DB, adding new items to the DB and updating existing items.
 * 
 * @author Ryan Gordon
 *
 */
@RequestMapping("/secure/products/")
@Controller
public class ProductController {
	
	
	@Autowired
	@Qualifier("ProdService")
	ProductService prodServ;
	
	
	@GetMapping(value = "/showProducts")
	public String getAllProducts(Model model){
		model.addAttribute("AllProducts", prodServ.getProducts());
		return "allProducts";
	}
}