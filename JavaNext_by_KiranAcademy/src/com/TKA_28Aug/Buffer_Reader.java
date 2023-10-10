package com.TKA_28Aug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Reader {

	public static void main(String[] args) throws IOException {
		BufferedReader buf=new BufferedReader(new FileReader("source.txt"));
		BufferedWriter b=new BufferedWriter(new FileWriter("target.txt"));
		
		String s=null;
		while((s=buf.readLine())!= null)
		{
				b.write(s);
		}
		System.out.println("Write here:");
		
		buf.close();
		b.close();
	}
}
