package com.TKA_25Sept;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	 private String name;
	private float percentage;
	
	public Student()
	{
		
	}
	public Student(int id, String name, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getPercentage()
	{
		return percentage;
	}
//	public String getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", price=" + price + "]";
//	}

	
	

}
