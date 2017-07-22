package com.java.core;

public class Test6 {

	public static void main(String[] args) {
		new D();
	}

}

class C {

	int a;
	{
		a = 99;
		System.out.println("C-IIB");

	}
	static {
		System.out.println("C-SB");
	}
}

class D extends C {
	int a;
	{
		a = 88;
		System.out.println("D-IIB");
	}
	static {
		System.out.println("D-SB");
	}
}
