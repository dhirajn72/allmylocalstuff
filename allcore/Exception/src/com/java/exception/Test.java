/**
 * 
 */
package com.java.exception;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test {
	public static void main(String[] args) {
		int a = new TestA().m1();
		System.out.println(a);

	}

}

class TestA {

	@SuppressWarnings("finally")
	public int m1() {
		int x = 0;
		try {
			System.out.println("try block");
			Class.forName("Hello");
			x = 10;
			return x;

		} catch (ClassNotFoundException e) {
			System.out.println("catch block");
			x = 20;
			return x;

		} finally {
			System.out.println("finally block");
			return x;
		}

	}
}
