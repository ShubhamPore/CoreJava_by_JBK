package com.TKA_25Sept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestWriter{

	public static void main(String[] args) {
		Student s1=new Student(101,"Shubham",1200f);
		Student s2=new Student(102,"Sam",1100f);
		Student s3=new Student(103,"Summ",1150f);
		Student s4=new Student(104,"Anny",1000f);
		Student s5=new Student(105,"Bhushan",00f);
		Student s6=new Student(106,"Vishal",100f);
		Student s7=new Student(107,"Ninad",100f);
		Student s8=new Student(108,"Smap",200f);
		Student s9=new Student(109,"Smit",1100f);
		Student s10=new Student(101,"Sneh",1000f);
		
		ArrayList<Student> stuList=new ArrayList<>();
		stuList.add(s1);  
		stuList.add(s2);    
		stuList.add(s3);    
		stuList.add(s4);   
		stuList.add(s5);    
		stuList.add(s6);
		stuList.add(s7);
		stuList.add(s8);
		stuList.add(s9);
		stuList.add(s10);
//		for(int i=0;i<stuList.size();i++)
//		{
//			System.out.println(stuList.get(i));
//			
//		}
		
		try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("destination.txt")))
		{
			oos.writeObject(stuList);
			System.out.println("Data is written in destination.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
