package com.TKA_6sept;

public class Product_Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product p1=new Product(101,"Pen",10f);
		
        Product p2=(Product) p1.clone();
        p2.id=102;
		p2.name="Pencil";
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
