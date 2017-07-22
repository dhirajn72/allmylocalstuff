package com.java.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("dhiraj");
		set.add("singh");
		set.add(99);
		set.add(85.99);
		set.add('A');

		// set.forEach(e -> method1(e, 10));

		/*
		 * for (String object : set) { System.out.println(object); }
		 */

		set.forEach((e) -> System.out.println(e));

	}

	public static void method1(Object ob, int a) {
		System.out.println("inside method1:" + ob + " " + a);
	}

	public static void method1(Object ob, String str) {
		System.out.println("inside method1:" + ob + " " + str);
	}

	public static void method1(Object ob, char ch) {
		System.out.println("inside method1:" + ob + " " + ch);
	}

}
