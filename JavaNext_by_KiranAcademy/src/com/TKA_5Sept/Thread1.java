package com.TKA_5Sept;

public class Thread1 {
	

	public static void main(String[] args) {
		new Thread()
		{
			public void run()
			{
				System.out.println("Hello");
			}
		}.start();
	}

}
