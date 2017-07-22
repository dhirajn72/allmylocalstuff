package com.java.core;

public class Test5 {

	public static void main(String[] args) {

		Test5A test5a = new Test5A(10, "", 99, 99, 88);
	}
}

class Ex {
	public Ex(int a, int b, String c, long d) {
		System.out.println("Ex-4 args");
	}
}

class Test5A {
	int a;
	String str;
	double bal;
	long phone;
	int age;

	public Test5A(int a) {
		super();
		this.a = a;
	}

	public Test5A(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}

	public Test5A(int a, String str, double bal) {
		super();
		this.a = a;
		this.str = str;
		this.bal = bal;
	}

	public Test5A(int a, String str, double bal, long phone) {
		super();
		this.a = a;
		this.str = str;
		this.bal = bal;
		this.phone = phone;
	}

	public Test5A(int a, String str, double bal, long phone, int age) {
		this(age, str, bal, phone);
		new Ex(10, 20, "hello", 40);
		this.a = a;
		this.str = str;
		this.bal = bal;
		this.phone = phone;
		this.age = age;
		System.out.println("Test5A-5 args");
	}

	public void m1() {
		this.a = 88;
	}

}