package com.TKA_29Aug;

import java.io.Serializable;
public class Product implements Serializable {
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
}
