package com.TKA_14Sept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_Student {
	public static void main(String[] args) {
		Student s1=new Student(101,"Shubham",9.48f);
		Student s2=new Student(102,"Shubham",9.48f);
		
		FileOutputStream fos=null;
		ObjectOutputStream ois=null;
		
		try {
			fos=new FileOutputStream("target.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
			if(fos!=null)
				fos.close();
			if(ois!=null)
				ois.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		
		
	}

}
