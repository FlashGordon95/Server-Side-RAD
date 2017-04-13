package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Order;
import com.sales.models.Product;
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
	
	public void addProduct(Order p){
		try {
			repo.save(p);
			
		} catch (Exception exc) {
			
		}
	}
		
	
	public ArrayList<Order> getProducts(){
		System.out.print("Tring to retreive products from DB");
		return (ArrayList<Order>) repo.findAll();
	}

}



