/**
 * 
 */
package com.java.oops;

import java.util.Scanner;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {

	public static void main(String[] args) {
		System.out.println(Test1A.a);

		
		
	}
}

class Test1A {
	final static int a;
	static {
		a = 90;
	}
	/*
	 * { a = 90; }
	 */
}
