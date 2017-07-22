package com.java.core;

public class Test2 {

	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println("Main:" + h.b + " " + h.a);//0 10

	}

}

class Hello {

	static int a;
	int b;
	static {
		a = 10;
		Hello h = new Hello();
		h.b = 20;
		System.out.println("SB:" + h.b + " " + h.a);//20 10
	}

}
