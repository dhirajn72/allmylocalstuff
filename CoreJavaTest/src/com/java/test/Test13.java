package com.java.test;

public class Test13 {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		// new A();
		new B();

		Class cls = A.class;
		System.out.println(cls.newInstance());
		cls = B.class;
		System.out.println(cls.newInstance());
		System.out.println("**********************************");
		
		A01 a01= new B01();
		a01.m1();
		

	}
}

class A01 {
	public A01() {
		System.out.println("A()-DC");
	}

	public static void m1() {
		System.out.println("m1-super class");
	}
}

class B01 extends A01 {
	public B01() {
		System.out.println("B()-DC");
	}

	public static void m1() {
		System.out.println("m1-sub class");
	}
}
abstract class Test13A{
	
	native void m1();
	
}