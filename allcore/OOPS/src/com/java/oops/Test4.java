/**
 * 
 */
package com.java.oops;

/**
 * @author Dhiraj Singh
 * @website dhiraj.singh.90@facebook.com
 *
 */
public class Test4 {
	public static void main(String[] args) {
		Student1 student1 = new Student1();
	}
}

abstract class Person1 {

	/**
	 * 
	 */
	public Person1() {
		System.out.println("Person-DC");
	}

	public Person1(int a, String str) {
		System.out.println("Person-2 Args");
	}

	public abstract void m1();

}

class Student1 extends Person1 {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.oops.Person1#m1()
	 */
	@Override
	public void m1() {
		System.out.println("Student1-m1()");
	}

	/**
	 * 
	 */
	public Student1() {
		super(10, "hai");
		System.out.println("Student1-DC");
	}
}
