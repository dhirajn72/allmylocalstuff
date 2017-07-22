package com.java.core;

public class Test11 {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}
}

class A {
	static void m1() {
		System.out.println("sup");
	}
}

class B extends A {
	static void m1() {
		System.out.println("sub");
	}
}