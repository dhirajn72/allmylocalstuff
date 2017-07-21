package com.java.test.exceptions;

public class Test2 {
	public static void main(String[] args) {

		System.out.println("main starts");
		new A().m1();
		System.out.println("main ends");

	}

}

class A {

	void m1() {
		System.out.println("m1()-called");
		int x = m2();
		System.out.println("m1()-ends");
	}

	int m2() {
		throw new NullPointerException();
	}
}
