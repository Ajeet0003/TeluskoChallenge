package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entities.Product;

@Repository
public interface ProductDb extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
