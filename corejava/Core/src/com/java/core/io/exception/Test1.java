package com.java.core.io.exception;

public class Test1 {

	public static void main(String[] args) {

		System.out.println(new Hello().show());
	}

}

class Hello {
	int show() {

		int a = 0;
		try {
			System.out.println("try begins" + a);
			a = 10 / 0;
			System.out.println("try ends" + a);
			return a;
		} catch (ArithmeticException e) {
			a = 20;
			System.out.println("catch block" + a);
			return a;
		} finally {
			a = 30;
			System.out.println("finally block" + a);
			return a;
		}

	}
}