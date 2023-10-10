package com.TKA_28Aug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader (new FileReader("source.txt")) ;
		BufferedWriter d = new BufferedWriter (new FileWriter("target.txt"));
		
		String s= null ;
		while((s= buf.readLine()) !=null) {
			d.write(s);
		}
		System.out.println("Write the data here. ");
		buf.close();
		d.close();
	}

}
