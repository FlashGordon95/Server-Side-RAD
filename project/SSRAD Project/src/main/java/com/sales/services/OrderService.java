package com.sales.services;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Order;
import com.sales.repositories.OrderDAO;
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
	
	public void addOrder(Order p){
		try {
			
			
			//If all Ok save to the DB
			
			repo.save(p);
			
		} catch (Exception exc) {
			
		}
	}
		
	
	public ArrayList<Order> getOrders(){
		System.out.print("Tring to retreive products from DB");
		return (ArrayList<Order>) repo.findAll();
	}

}



