package com.java8.core;

interface Person {

	void fname();

	default void lname() {
		System.out.println("Person-lname()");
	};

	void age();

}

interface Student extends Person {
	/*@Override
	public default void lname() {
		System.out.println("Student-lname()");
	}*/

}

class Young implements Student, Person {

	@Override
	public void fname() {
		System.out.println("Young-fname()");
	}

	@Override
	public void age() {
		System.out.println("Young-age()");
	}

	/*@Override
	public void lname() {
		System.out.println("Young-lname()");
	}*/

}

class Boy extends Young implements Student {
}

public class Test5 {
	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.lname();

	}
}
