package com.java8.features2;

public class DefaultInterface {

	public static void main(String[] args) {
		Test test = new Test();
		test.print();

	}
}

class Test implements TwoWheeler, FourWheeler {

	// Option 1 ovverride and call specific method

	/*
	 * @Override public void print() { TwoWheeler.super.print();
	 * FourWheeler.super.print(); }
	 */

	// Option 2 use the signature and provide your own implementation

	public void print() {
		// TwoWheeler.print();
		// TwoWheeler.super.print();

		System.out.println("My own implementation here");

	}
	/*** This is not allowed **/
	// public void print();

}

interface TwoWheeler {

	default void print() {
		System.out.println("Two wheeler");

	}
	/*
	 * default int print() { System.out.println("Two wheeler"); return 10; }
	 */
	/*
	 * static void print() { System.out.println("Two wheeler"); }
	 */
}

interface FourWheeler {

	default void print() {
		System.out.println("Four wheeler");
	}
}
