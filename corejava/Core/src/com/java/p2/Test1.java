package com.java.p2;

public class Test1 {

	public static void main(String[] args) {

		// new B().m1();
		new B().m2();
	}

}

class A {

	void m1() {
		System.out.println("A-m1()");
	}

	static void m2() {
		System.out.println("A-m2()");
	}

}

class B extends A {
	void m1() {
		// super.m2();
		System.out.println("B-m1()");
	}

	static void m2() {

		System.out.println("B-m2()");
	}

}
