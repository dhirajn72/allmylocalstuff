package com.java.core.oops;

public class Test {
	public static void main(String[] args) {

		Person person = new Person();
		System.out.println(person.a);
		person.m1();
		System.out.println(person);
		
		System.out.println("*******");
		person = new Student();
		// System.out.println(((Student) person).a);
		System.out.println(person.a);
		person.m1();

		System.out.println(person);
		System.out.println("********");
		person = new Employee();
		System.out.println(person.a);
		System.out.println(person.pname);
		person.m1();
		
		

		System.out.println(person);

	}
}
