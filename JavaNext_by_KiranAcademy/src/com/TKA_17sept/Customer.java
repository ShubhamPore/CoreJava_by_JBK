package com.TKA_17sept;

public class Customer {

	int id;
	String name;
	String phoneno;
	public Customer(int id, String name, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
