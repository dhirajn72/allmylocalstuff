package com.java8.core;

public class Test1 {

	public static void excuteMethod(Inter1 inter) {

	}

	public static void main(String[] args) {

		System.out.println("main() finishes");

	}
}

// @FunctionalInterface
interface Inter1 {
	void m1();

	void m2(int a, int b);

	void m3(String str);

	void m4(int a, String msg);

}
