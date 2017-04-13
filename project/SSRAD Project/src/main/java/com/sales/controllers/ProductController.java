package com.sales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.sales.services.ProductService;

@RequestMapping("/secure/products/")
@Controller
public class ProductController {
	
	
	//@Autowired
	//@Qualifier("ProdService")
	//ProductService prodServ;
	
	
	@GetMapping(value = "/all-products")
	public String getAllProducts(Model model){
		//model.addAttribute("AllProducts", prodServ.getProducts());
		return "allProducts";
	}
}