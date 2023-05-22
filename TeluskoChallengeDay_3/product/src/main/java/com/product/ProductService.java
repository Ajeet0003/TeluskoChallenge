package com.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProductService {

	@Autowired
	ProductDb productDb;

	public void addProduct(Product p) {
		productDb.save(p);
	}
	
	public List<Product> getAllProduct(){
		List<Product> productList= productDb.findAll();
		return productList;
	}
	
	public Product getProductByName(String name){
		Product product= productDb.findByName(name);
		return product;
	}
	
	public List<Product> searchProduct(String text){
		List<Product> productList= productDb.findAll();
		List<Product> productOutOfWarranty=new ArrayList<>();
		for(Product p:productList) {
			if(p.getName().toLowerCase().contains(text.toLowerCase())||p.getPlace().toLowerCase().contains(text.toLowerCase())||p.getType().toLowerCase().contains(text.toLowerCase())) {
				productOutOfWarranty.add(p);
			}
		}
		return productOutOfWarranty;
	}
	
	public List<Product> getAllProductOutOfWarranty(){
		List<Product> productList= productDb.findAll();
		List<Product> productOutOfWarranty=new ArrayList<>();
		for(Product p:productList) {
			if(p.getWarranty()<2023) {
				productOutOfWarranty.add(p);
			}
		}
		return productOutOfWarranty;
	}
}
