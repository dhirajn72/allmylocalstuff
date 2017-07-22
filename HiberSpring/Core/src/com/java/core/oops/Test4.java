package com.java.core.oops;

public class Test4 {
	public static void main(String[] args) {

		Test4A test4a = new Test4A();
		test4a.m1();

		test4a = new Test4B();
		test4a.m1();
		// ((Test4B) test4a).m1();

	}
}

class Test4A {
	static void m1() {
		System.out.println("Test4A-m1()");
	}
}

class Test4B extends Test4A {

	static void m1() {
		System.out.println("Test4B -m1()");
	}

	static void m2() {
		System.out.println("Test4B -m1()");
	}
}
