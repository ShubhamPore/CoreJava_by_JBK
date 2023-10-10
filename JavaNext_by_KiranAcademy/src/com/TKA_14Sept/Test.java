package com.TKA_14Sept;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Cutomer c1=new Cutomer(1,"Shubham","8327735");
		Cutomer c2=new Cutomer(2,"Summ","832754355");
		Cutomer c3=new Cutomer(3,"Sam","5127735");
		
		Product p1=new Product(11,"Pen",13);
		Product p2=new Product(12,"Pencil",07);
		Product p3=new Product(13,"Marker",18);
		
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
//		for(int i=1;i<=al.size();i++)
//		{
//			
//			System.out.println(al.get(i));
//			Order o2=new Order(102,c2,al.get(i));
//		}
		
		Order o1=new Order(101,c1,al);
		System.out.println("Name of the Customer:"+c1.name+"\n"+"Total bill of Customer:"+o1.calTotal());
		//System.out.println("Total bill of Customer:"+o1.calTotal());
		
		
		
		
	}
	
	
}
