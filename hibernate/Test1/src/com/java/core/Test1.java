package com.java.core;

public class Test1 {

	public static void main(String[] args) {

		B b = new B(99, "Hello");
		b.m1();
	}

}

abstract class A {
	int x;
	String y;

	public A() {
		// TODO Auto-generated constructor stub
	}

	public A(int x, String y) {
		System.out.println("DC-A");
		this.x = x;
		this.y = y;
	}

	public void m1() {
		System.out.println("m1");
	}
}

class B extends A {
	int a;
	String b;

	public B() {
		System.out.println("DC-B");
	}

	public B(int a, String b) {
		super(a, b);
		this.a = a;
		this.b = b;
		System.out.println("B(int,String)");
	}

}