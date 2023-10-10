package com.TKA_29Aug;

import java.io.File;

public class Create_File {
	public static void main(String[] args) {
		File f=new File("D:\\eclipse_workspace\\JavaNext_by_KiranAcademy\\Infy\\aaa\\bbb\\ccc");
		f.mkdirs();
		System.out.println("Dir are created");
	}

}
