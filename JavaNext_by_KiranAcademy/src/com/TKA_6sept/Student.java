package com.TKA_6sept;
import java.util.Objects;

public class Student {
	private int id;
	private String name;
	public int hashCode()
	{
		return id;
		
	}
	public String hashcode()
	{
		return name;
	}
//	public boolean equals(Object obj)
//	{
//		Student s=(Student) obj;
//		return
//				(
//			this.id==s.id &&
//					this.name.equals(s.name)
//				) ?
//						true:false;
//	}
	
	public boolean equals(Object obj)
	{
		Student s=(Student) obj;
	    return(this.id==s.id && this.name.equals(s.name))?
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
		return "Student_UsingHashcode [id=" + id + ", name=" + name + "]";
	}
	
	

}
