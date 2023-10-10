package com.TKA_28Aug;

import java.io.FileOutputStream;
import java.io.IOException;

public class Reader_Writer1 {

	public static void main(String[] args) throws IOException {
		String s="GoodMorningMumbai";
		FileOutputStream fos=new FileOutputStream("target.txt");
		fos.write(s.getBytes());
		System.out.println("Data is written n");
		
		
	}
}
