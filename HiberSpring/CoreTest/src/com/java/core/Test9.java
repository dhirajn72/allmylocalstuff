package com.java.core;

import java.io.File;
import java.io.PrintStream;

public class Test9 {
	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream("/home/dhiraj/hello.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 20000; i++) {
			Hello hello = new Hello();
			hello.show();
			hello = null;
			Hello hello2 = new Hello(77, "hello");
			Hello hello3 = new Hello(77, "hello");
			Hello hello4 = new Hello(77, "hello");
			hello2 = hello3;
			hello4 = null;

			new Hello(88, "hello").show();
		}
		// Runtime.getRuntime().runFinalization();
		// System.runFinalization();
		// System.gc();
	}
}

class Hello {
	int a;
	String str;

	public Hello() {

		System.out.println("DC called");

	}

	public Hello(int a, String str) {
		super();
		this.a = a;
		this.str = str;
		System.out.println("Args called");
	}

	public void show() {
		int a = 88;
		int b = 99;
		String str = "hello world";
		System.out.println(a + " " + this.a + " " + this.str);
		System.out.println(b);
		System.out.println(str);
		Hello hello2 = new Hello(77, "hello");
		Hello hello3 = new Hello(77, "hello");
		Hello hello4 = new Hello(77, "hello");

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() method of Hello called");
	}

}