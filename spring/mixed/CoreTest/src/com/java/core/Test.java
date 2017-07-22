/**
 * 
 */
package com.java.core;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Test {
	public static void main(String[] args) {

		try {
			int x = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
		}

	}
}
