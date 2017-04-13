package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.models.Product;
import com.sales.repositories.CustomerDAO;
import com.sales.repositories.OrderDAO;
import com.sales.repositories.ProductDAO;

/**
 * CustomerService
 * A service class which consumes a DAO interface for customers.
 * Encapsulates the process for retrieving customers from the DB, 
 * adding new items to the DB and updating existing items.
 * 
 * @author Ryan Gordon
 *
 */

@Service("CustService")
public class CustomerService {

	@Autowired
	private CustomerDAO repo;
	
	public void addCust(Customer c){
		try {
			repo.save(c);
			
		} catch (Exception exc) {
			
		}
	}
		
	
	public ArrayList<Customer> getCustomers(){
		System.out.print("Tring to retreive products from DB");
		return (ArrayList<Customer>) repo.findAll();
	}

}



