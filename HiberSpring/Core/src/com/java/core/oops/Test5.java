package com.java.core.oops;

public class Test5 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.m1();
		System.out.println(inner.a);
	}
}

class Outer {

	int a = 99;

	void m1() {
		System.out.println("m1-outer");
	}

	class Inner {
		int a = 99;

		void m1() {
			System.out.println("m1-Inner");
			System.out.println(Inner.this);
		}
	}

}