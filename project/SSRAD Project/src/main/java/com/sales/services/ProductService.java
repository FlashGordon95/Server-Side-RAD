package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Product;
import com.sales.repositories.ProductDAO;


@Service("ProdService")
public class ProductService {

	@Autowired
	private ProductDAO repo;
	
	public void addProduct(Product p){
		try {
			repo.save(p);
			
		} catch (Exception exc) {
			
		}
	}
		
	
	public ArrayList<Product> getProducts(){
		System.out.print("Tring to retreive products from DB");
		return (ArrayList<Product>) repo.findAll();
	}

}



