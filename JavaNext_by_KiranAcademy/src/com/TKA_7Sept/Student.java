package com.TKA_7Sept;

import java.util.Objects;

public class Student {
	int id;
	String name;
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		return (this.id==s.id && this.name.equals(s.name)) ?
				true:false;
	}
	public Student()
	{
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
