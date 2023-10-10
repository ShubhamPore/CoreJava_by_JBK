package com.TKA_29Aug;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test_Read {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("target.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=(Object)ois.readObject();
		
		ArrayList<Product> al=(ArrayList<Product>)obj;
		al.forEach(p->System.out.println(p));
	}

}
