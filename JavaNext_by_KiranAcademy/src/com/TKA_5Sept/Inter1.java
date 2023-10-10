package com.TKA_5Sept;

public interface Inter1 {
	public static final int x=10;
	public abstract void m1();
	static void m2()
	{
		System.out.println("Static void");
	}
	default void m3()
	{
		System.out.println("Default  method");
	}

//	public static void m4()
//	{
//		System.out.println("Hii");
//	}
}
