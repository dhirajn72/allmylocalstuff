package com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {

		Test3B test3b = new Test3B();
		// test3b.m1();
		List list = new ArrayList();
		list.add("dk");
		list.add(99);
		list.add('a');
		list.add("ck");
		/*
		 * list.forEach((yash) -> System.out.println(yash));
		 * System.out.println("**********"); list.forEach(yash ->
		 * System.out.println(yash)); System.out.println("***************");
		 * list.forEach(System.out::println);
		 */

		// System.out.println(list.stream().map(e->e+"dk").hashCode());

	}
}

abstract class Test3A {
	abstract void m1();
}

class Test3B extends Test3A {

	@Override
	void m1() {
		System.out.println("Test3B-m1()");
	}

	int m1(int a) {
		System.out.println("Test3B-m1(a)");
		return a + 10;
	}

}