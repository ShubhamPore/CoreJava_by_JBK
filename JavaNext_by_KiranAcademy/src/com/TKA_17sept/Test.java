package com.TKA_17sept;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Product p1=new Product(101,"Lapy",100020);
		Product p2=new Product(102,"Washing Machine",50020);
		Product p3=new Product(103,"P.C.",40020);
		Product p4=new Product(104,"Fridge",30020);
		Product p5=new Product(105,"T.V.",20020);
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		for(Product t:list)
		{
			t.setPrice(t.getPrice()+t.getPrice()*(0.20f));
		}
		
		ArrayList<Product> basket=new ArrayList<Product>();
		basket.add(p1);
		basket.add(p2);
		basket.add(p3);
		
		Customer c=new Customer(11,"Shubham","71985333");
		Order o1=new Order(23,c,basket);
		
		System.out.println(o1.getC().getName());
		System.out.println(o1.getDt());
		
		System.out.println();
		ArrayList<Product> prod=o1.getList();
		prod.forEach(p->
		System.out.printf("\n"+p.getName()+" "+p.getPrice()));		
		System.out.println();
		System.out.println();
		System.out.println(o1.calBill());
		o1.applyDiscount(20);
		System.out.println(o1.getFinalbill());
		
	}

}
