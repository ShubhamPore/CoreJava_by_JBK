package com.TKA_29Aug;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test_Write {

	public static void main(String[] args) throws IOException {
		Product p1=new Product(11,"Pen",20);
		Product p2=new Product(12,"Pencil",10);
		Product p3=new Product(13,"Marker",30);
		
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		FileOutputStream fos=new FileOutputStream("target.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fos);
		ois.writeObject(al);
		
		System.out.println("Object Written in file____________");
		ois.close();
		fos.close();
	}
}
