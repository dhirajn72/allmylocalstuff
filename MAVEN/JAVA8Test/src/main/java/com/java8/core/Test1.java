package com.java8.core;

public class Test1 {
	public static void main(String[] args) {

		Inter1 inter1 = message -> System.out.println("Lambda expression");

		System.out.println("main() finishes");

	}
}

interface Inter1 {
	void m1(String message);
}
