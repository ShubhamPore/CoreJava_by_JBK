package com.TKA_14Sept;

import java.util.ArrayList;

public class Order {
	int id;
	Cutomer c;
	ArrayList<Product> list=new ArrayList<Product>();
	
	
	public Order(int id, Cutomer c, ArrayList<Product> list) {
		super();
		this.id = id;
		this.c = c;
		this.list = list;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", c=" + c + ", list=" + list + "]";
	}


	float calTotal()
	{
		float totalbill=0.0f;
		for(int i=0;i<list.size();i++)
		{
			Product t=list.get(i);
		totalbill=totalbill+t.price;
		}
		return totalbill;
	}
	

}
