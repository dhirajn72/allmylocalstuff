package com.java.core;

public class Test8 {

	public static void main(String[] args) {
		new Son();
	}

}

class GrandFather {
	public GrandFather() {
		System.out.println("GrandFather-DC");
	}

	static {
		System.out.println("GrandFather-SB");
	}
	{
		System.out.println("GrandFather-IIB");
	}

}

class Father extends GrandFather {
	public Father() {
		System.out.println("Father-DC");
	}

	static {
		System.out.println("Father-SB");
	}
	{
		System.out.println("Father-IIB");
	}

}

class Son extends Father {
	public Son() {
		System.out.println("SON-DC");
	}

	static {
		System.out.println("Son-SB");
	}
	{
		System.out.println("Son-IIB");
	}

}