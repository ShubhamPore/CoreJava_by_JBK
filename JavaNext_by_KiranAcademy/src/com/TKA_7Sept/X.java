package com.TKA_7Sept;

public class X {

	public static void main(String[] args) {
		String s1=null;
		String s2=new String("Hello");
		
		if(s1!=null)
			System.out.println(s1.toUpperCase());
		
		Optional<String> s=Optional ofNullable(new String("Hello"));
		else
			System.out.println("Both are not equal");
		
	}

	private static void ofNullable(String string) {
		// TODO Auto-generated method stub
		
	}
}
