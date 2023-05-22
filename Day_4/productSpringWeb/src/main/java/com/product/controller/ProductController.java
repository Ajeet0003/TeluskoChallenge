package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product p) {
		service.addProduct(p);
	}

	// System.out.println("+++++++Get All Product+++++++++++");
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {
		List<Product> products = service.getAllProduct();

		return products;
	}

	// System.out.println("+++++++Get Product By Name +++++++++++");
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable String name) {
		Product product = service.getProductByName(name);

		return product;
	}

	// System.out.println("+++++++Search Product By text +++++++++++");

	@GetMapping("/searchProduct/{text}")
	public List<Product> searchProduct(@PathVariable String text) {
		List<Product> products2 = service.searchProduct(text);
		return products2;
	}

	// System.out.println("+++++++Get Product By out of warranty +++++++++++");
	@GetMapping("/getAllProductOutOfWarranty")
	public List<Product> getAllProductOutOfWarranty() {
		List<Product> products3 = service.getAllProductOutOfWarranty();
		return products3;
	}
}
