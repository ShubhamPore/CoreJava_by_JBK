package com.TKA_5Sept;

import java.util.Vector;



public class Test_Employee {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Shubham",300000,"Manager");
		Employee e2=new Employee(102,"Sam",100000,"Tester");
		Employee e3=new Employee(103,"Summ",200000,"Analyst");
		Employee e4=new Employee(104,"Ann",20000,"Developer");
		
		Vector<Employee> em=new Vector <Employee>();
		em.add(e1);
		em.add(e2);
		em.add(e3);
		em.add(e4);
		for(int i=0;i<em.size();i++)
		{
			
		System.out.println(em.get(i));
		}
		
	System.out.println("Display the Manager");
		for(Employee t:em)
		if((t.role).equals("Manager"))
		{
			System.out.println(t);
		}
	

	
	}

}
