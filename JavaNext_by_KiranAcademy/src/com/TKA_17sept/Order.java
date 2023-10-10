package com.TKA_17sept;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
	private int id;
	private Customer c;
	private ArrayList<Product> list;
	private LocalDateTime dt;
	private float finalbill;
	
	public Order(int id, Customer c, ArrayList<Product> list) {
		super();
		this.id = id;
		this.c = c;
		this.list = list;
		 dt=LocalDateTime.now();
		//this.finalbill = finalbill;
	}
	
	float calBill()
	{
		float bill=0.0f;
		for(Product p:list) {
			bill=bill+p.getPrice();
		}
		finalbill=bill;
		return bill;
			
	}
	
	void applyDiscount(float discount)
	{
		if(discount<100)
			finalbill=finalbill-finalbill*(discount/100);
		else
			System.out.println("Discount aur paise saath mei nhi milte hei");
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the c
	 */
	public Customer getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(Customer c) {
		this.c = c;
	}

	/**
	 * @return the list
	 */
	public ArrayList<Product> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Product> list) {
		this.list = list;
	}

	/**
	 * @return the finalbill
	 */
	public float getFinalbill() {
		return finalbill;
	}

	/**
	 * @param finalbill the finalbill to set
	 */
	public void setFinalbill(float finalbill) {
		this.finalbill = finalbill;
	}

	/**
	 * @return the dt
	 */
	public LocalDateTime getDt() {
		return dt;
	}

	/**
	 * @param dt the dt to set
	 */
	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", c=" + c + ", list=" + list + ", dt=" + dt + ", finalbill=" + finalbill + "]";
	}
	
	
	

}
