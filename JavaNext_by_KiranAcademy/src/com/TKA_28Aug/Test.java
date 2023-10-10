package com.TKA_28Aug;

public class Test {

	public static void main(String[] args) {
		Threading t=new Threading();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		t1.start();
		t2.start();
	}
}
