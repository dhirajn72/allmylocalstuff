package com.java.core;

public class Test7 {

	public static void main(String[] args) {
		Test7A test7a = new Test7A();
		test7a.m1();
		System.out.println(test7a.a);
		test7a = new Test7B();
		test7a.m1();

		System.out.println(test7a.a);

	}
}

class Test7A {

	int a = 10;

	void m1() {
		System.out.println("m1()-Test7A");
		Test7A test7a = this;
		System.out.println(test7a);
	}

}

class Test7B extends Test7A {

	int a = 20;

	void m1() {
		System.out.println("m1()-Test7B");
		System.out.println(this);
	}

}
