package com.java.core;

public class Test4 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		new Hello();
		// Hello h2 = new Hello();
		/*
		 * System.out.println(h1.a+" "+h2.a); h1.a=99;
		 * System.out.println(h1.a+" "+h2.a);
		 */

	}
}

class Hello {/*
			 * static int a;
			 */
	{
		System.out.println("iib");
	}
	static {
		System.out.println("sib");
	}
}