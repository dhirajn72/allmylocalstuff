package com.java.core.designpattern;

public class Test {
	public static void main(String[] args) {

		AdapterClass adapterClass = new AdapterClass();
		Test1 test1 = (Test1) adapterClass.methods(1);
		test1.m1();
		test1.m2();

		Test2 test2 = (Test2) adapterClass.methods(0);
		test2.m1();
		test2.m2();

	}
}
