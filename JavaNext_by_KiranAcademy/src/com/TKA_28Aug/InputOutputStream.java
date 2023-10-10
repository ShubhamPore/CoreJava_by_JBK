package com.TKA_28Aug;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputStream {

	public static void main(String[] args) throws IOException {
		
		File file =new File("source.txt");
		FileInputStream fis=new FileInputStream(file);
		byte[] data=new byte[(int) file.length()];
		fis.read(data);
		
		FileOutputStream fos=new FileOutputStream("target.txt");
		fos.write(data);
		
		fis.close();
		fos.close();
		System.out.println("data is written n");
	}
}
