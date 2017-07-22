package com.java.core;

import java.util.ArrayList;

public class Test1 {

	static final ArrayList list = new ArrayList(100);

	public static void main(String[] args) {
		byte b = +121;
		System.out.println(b);

		final int x = 99;
		byte b1 = x;
		System.out.println(x);
		System.out.println("******************");

		new A().a = 88;
		System.out.println(new A().a);
		System.out.println("*************************");

		System.out.println();
		System.out.println(list.size());
	}
}

class A {
	int a;
	static {
	}

	public void show(A a) {
		// this=a;
	}

}
