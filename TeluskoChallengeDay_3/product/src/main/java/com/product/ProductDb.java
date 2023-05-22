package com.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDb extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
