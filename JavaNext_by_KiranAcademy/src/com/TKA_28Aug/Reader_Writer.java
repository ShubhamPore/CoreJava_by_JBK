package com.TKA_28Aug;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Reader_Writer {
	public static void main(String[] args) throws IOException {
		try {
			FileWriter fw = new FileWriter("Shu.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter some data to write to the file: ");
			String userInput = scan.nextLine();
			bw.write(userInput);
			bw.close();
			System.out.println("Data written to file successfully!");
			} catch (IOException e) 
		{
			System.out.println();	
		}

	}

}
