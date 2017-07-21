package com.java.test;

public class Test12 {

	static {
		System.out.println("SB starts");
		main(new String[] { "DK", "SINGH" });
		System.out.println("SB ends");
	}

	public static void main(String... args) {
		System.out.println("main");
		for (String s : args) {
			System.out.println(s);
		}
		System.out.println("main ends");
	}
}
