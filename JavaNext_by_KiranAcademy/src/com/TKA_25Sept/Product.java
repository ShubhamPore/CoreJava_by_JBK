package com.TKA_25Sept;

public class Product {
	private int id;
	private String name;
	private double price;
	private String category;
	
	public Product(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public String getCategory()
	{
		return category;
	}
	
	public void applyDiscount(float discountPercentage)
	{
		price -=price*(discountPercentage/100.0);
	}
	
	public void increasePrice(float percentage)
	{
		if("stationary".equalsIgnoreCase(category))
		{
			price+=price*(percentage/100);
		}
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
