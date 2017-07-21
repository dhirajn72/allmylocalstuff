package com.java.test.wrapper;

public class Test2 {
	public static void main(String[] args) {

		try {
			System.out.println("try");

			/*
			 * Below are the only two cases when
			 * finally block will not be executed
			 */

			// Runtime.getRuntime().halt(0);
			// System.exit(0);
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");

		}

	}
}