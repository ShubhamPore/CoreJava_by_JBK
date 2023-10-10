package com.TKA_15Sept;

public class Clone implements Cloneable {

	int rollno;
	String name;
	public Clone(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args)  {
		Clone c1=new Clone(101,"Shubham");
		try {
			Clone c2=(Clone) c1.clone();
			System.out.println(c1.rollno+" "+c1.name);
			System.out.println(c2.rollno+" "+c2.name);
		} catch (CloneNotSupportedException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
	}
	
}
