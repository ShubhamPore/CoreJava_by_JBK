package com.TKA_29Aug;

import java.io.File;

public class Create_Folder {
	public static void main(String[] args) {
		//String directorypath="infy";
		
		File f=new File("Infy");
		f.mkdir();
		System.out.println("File Created");
		
	}

}
