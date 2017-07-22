package com.java.core;

public class Test4 {

	static {
		System.out.println("SB");
		main(new String[] { "dk", "singh", "kumar" });
	}

	public static void main(String... args) {
		System.out.println("main");
		System.out.println(args.length);
		for (String str : args) {
			System.out.println(str);
		}

	}

}
/*
 * SB
 * main
 * 3
 * dk
 * singh
 * kumar
 * main
 * 0
 * 
 */

