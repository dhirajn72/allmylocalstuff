package com.java.core;

public class Test1 {
	public static void main(String[] args) {

		TestService testService = new TestService();
		testService.test1(null);
	}
}

class TestService {

	public void test1(Void void1) {
		System.out.println("Void");
	}
/*
	public void test1(String string) {

		System.out.println("String");
	}*/

	public void test1(Object object) {

		System.out.println("Object");
	}
}