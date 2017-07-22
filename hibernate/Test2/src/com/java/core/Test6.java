package com.java.core;

public class Test6 {
	public static void main(String[] args) {
		Test6A test6a = new Test6A();
		test6a.show(null);
		test6a.show(test6a);
		System.out.println(1088888888888888888l);
	}
}

class Test6A {
	void show(String str) {
		System.out.println("String");
	}

	void show(Object ob) {
		System.out.println("Object");
	}
}