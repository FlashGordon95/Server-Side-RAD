package com.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Order;
import com.sales.models.Product;

/**
 * OrderDAO
 * A DAO interface which extends a JpaRepository
 * 
 * @author Ryan Gordon
 *
 */

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {

	public Product findByoId(String pId);
}


