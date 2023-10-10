package com.TKA_6sept;

public class Test {
	public static void main(String[] args) {
		Faculty f1=new Faculty(101,"Shubham");
		Faculty f2=new Faculty(102,"Sam");
		
		System.out.println(f1);
		System.out.println(f2);
		
		f1=null;
		f2=null;
		//System.gc();
		Runtime.getRuntime().gc();
		
	}

}
