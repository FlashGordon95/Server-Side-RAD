package com.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.models.Product;

/**
 * CustomerDAO
 * A DAO interface which extends a JpaRepository
 * 
 * @author Ryan Gordon
 *
 */

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

	public Product findBycId(String pId);
}


