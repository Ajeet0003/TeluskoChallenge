package com.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String place;
	private String type;
	private int warranty;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String place, String type, int warranty) {
		super();

		this.name = name;
		this.place = place;
		this.type = type;
		this.warranty = warranty;
	}

	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", place=" + place + ", type=" + type + ", warranty=" + warranty
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
