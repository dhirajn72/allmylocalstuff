package com.java.p2;

public class Test3 {

	public static void main(String[] args) {

		Person p=new Student();
		p.m1();
		
	}

}

class Person {

	static void m1() {
		System.out.println("Person-m1()");
	}
}


class Student extends Person {
	static void m1() {
		System.out.println("Student-m1()");
	}

	void m2() {
		System.out.println("Student-m1()");
	}
}

class Employee extends Person {
	static	void m1() {
		System.out.println("Employee-m1()");
	}

	void m2() {
		System.out.println("Employee-m1()");
	}
}
