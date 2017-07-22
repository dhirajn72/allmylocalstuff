package com.java8.core;

public class Test1 {
	public static void main(String[] args) {

		Inter1 inter1 = new Inter1() {
			public void m1() {
				System.out.println("m1() called");
			}
		};

		inter1.m1();
		System.out.println("main() finishes");

	}
}

interface Inter1 {
	void m1();
}
