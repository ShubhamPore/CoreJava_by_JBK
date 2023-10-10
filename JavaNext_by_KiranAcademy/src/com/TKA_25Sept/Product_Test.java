package com.TKA_25Sept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product_Test {
	public static void main(String[] args) {
		ArrayList<Product> pl=new ArrayList<Product>();

		pl.add( new Product(101,"Pen",10.5,"Stationary"));
		pl.add( new Product(102,"Gulabjam",200.5,"Food"));
		pl.add( new Product(105,"Laptop",20000.5,"Electronics"));
		pl.add(new Product(104,"Marker",20.5,"Stationary"));
		pl.add(new Product(103,"Modak",200.5,"Food"));
		
		Collections.sort(pl,Comparator.comparing(Product::getId));
		System.out.println();
		System.out.println("------Sorted by ID-------");
		for(Product product:pl)
		{
			System.out.println(product);
		}
		
		Collections.sort(pl,Comparator.comparing(Product::getPrice));
		System.out.println();
		System.out.println("-------Sorted by Price---------");
		for(Product product:pl)
		{
			System.out.println(product);
		}
		Collections.sort(pl,Comparator.comparing(Product::getName));
		System.out.println();
		System.out.println("-------Sorted by Name---------");
		for(Product product:pl)
		{
			System.out.println(product);
		}
		
		Collections.sort(pl,Comparator.comparing(Product::getCategory));
		System.out.println();
		System.out.println("-------Sorted by Category---------");
		for(Product product:pl)
		{
			System.out.println(product);
		}
		
		for(Product product:pl)
		{
			product.applyDiscount(10);
		}
		System.out.println();
		System.out.println("-------Apply discount 10%----------");
		for(Product product:pl)
		{
			System.out.println(product);
		}
		
		for( Product product:pl)
		{
			product.increasePrice(20);
		}
		System.out.println();
		System.out.println("--------Increase Price-----------");
		for(Product product:pl)
		{
			System.out.println(product);
		}
	}

}
