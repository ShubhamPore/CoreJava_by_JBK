package com.TKA_6sept;

public class Product implements Cloneable {

	int id;
	String name;
	float price;
	
	public Product()
	{
		
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	
public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
