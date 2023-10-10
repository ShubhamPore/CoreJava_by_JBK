package com.TKA_6sept;

public class Faculty {
	int id;
	String name;
	public Faculty()
	{
		
	}
	public Faculty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}
	protected void finalize() throws Throwable{
		System.out.println(name+":Object memory se delete ho rha hei");
	}
	

}
