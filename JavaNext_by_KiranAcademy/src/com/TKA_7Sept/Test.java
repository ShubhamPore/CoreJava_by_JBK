package com.TKA_7Sept;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(101,"Shubham");
		Student s2=new Student(101,"Shubham");
		if(s1.equals(s2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
	}
}
