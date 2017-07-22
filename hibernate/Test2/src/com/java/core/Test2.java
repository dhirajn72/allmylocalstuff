package com.java.core;

public class Test2 {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}
}

abstract class A {
	int a;

	abstract void m1();

}

class B extends A {

	void m1() {
		System.out.println("B");
	}
}
