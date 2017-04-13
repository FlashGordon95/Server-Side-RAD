package com.sales.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Customer;
import com.sales.models.Product;
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
	
	
	/**
	 * The GET for route /addProduct
	 * Creates a form modelled with Product
	 * and returns the form
	 * @param model
	 * @return jsp page
	 */
	@GetMapping(value = "/addProduct")
	public String getProduct(Model model){
		// Create a model for the form
		Product prod = new Product();
		model.addAttribute("Product", prod);
	
		
		return "addProduct";
	}
	/**
	 * The POST for route /addProduct
	 * Attempts to add the cust to the DB
	 * If there are errors it will return to the addProduct page and show errors
	 * @param model
	 * @return jsp page
	 */
	@RequestMapping(value = "/addProduct",method=RequestMethod.POST)
	public String submitProduct(@Valid @ModelAttribute ("Product") Product prod, BindingResult result){
		//Try to add to DB
		prodServ.addProduct(prod);
		System.out.println(prod.toString());
		//If problem with DB go back to addCustomer page
		if (result.hasErrors()) {
			return "addProduct";
		}
		//If successful redirect to showCustomers page
		return "redirect:showProducts";
	}
}