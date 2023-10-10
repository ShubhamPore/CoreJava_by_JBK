package com.TKA_14Sept;

public class Student {
	int id;
	String name;
	float cgpa;
	public Student()
	{
		
	}
	public Student(int id, String name, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	
	

}
