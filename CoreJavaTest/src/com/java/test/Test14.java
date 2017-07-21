package com.java.test;

public class Test14 {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		// new A();
		new B();

		Class cls = A.class;
		System.out.println(cls.newInstance());
		cls = B.class;
		System.out.println(cls.newInstance());

	}
}

class A {
	public A() {
		System.out.println("A()-DC");
	}

	static void m1() {

	}

}

class B extends A {
	public B() {
		System.out.println("B()-DC");
	}

	static void m1() {
		// super.m1(); super keyword can't be used from static context

	}
}