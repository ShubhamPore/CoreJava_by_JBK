package com.TKA_5Sept;

public class Employee {
	int id;
	String name;
	double salary;
	 String role;
	public Employee()
	{
		
	}
	public Employee(int id, String name, double salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}
	

}
