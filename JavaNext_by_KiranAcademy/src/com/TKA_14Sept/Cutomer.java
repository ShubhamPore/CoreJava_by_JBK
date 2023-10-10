package com.TKA_14Sept;

public class Cutomer {
	int id;
	String name;
	String phoneno;
	public Cutomer()
	{
		
	}
		public Cutomer(int id, String name, String i) {
	
		super();
		this.id = id;
		this.name = name;
		this.phoneno = i;
	}

	@Override
	public String toString() {
		return "Cutomer [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}
	

}
