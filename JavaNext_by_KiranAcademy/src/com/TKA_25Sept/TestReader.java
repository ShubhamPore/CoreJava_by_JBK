package com.TKA_25Sept;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.TKA_25Sept.Student;

public class TestReader {
	
	public static void main(String[] args)  {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("destination.txt"))) {
	         
		//	@SuppressWarnings("unchecked")
			ArrayList<Student> stuList = (ArrayList<Student>) ois.readObject();

            for (Student student : stuList) {
            	System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Percentage: " + student.getPercentage());
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	   
	//	Read more: https://www.java67.com/2016/07/how-to-read-text-file-into-arraylist-in-java.html#ixzz8EKYUA5VF
	}

}
