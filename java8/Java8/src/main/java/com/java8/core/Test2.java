package com.java8.core;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");

		list.forEach(x -> System.out.println(x));
		System.out.println("*********");

		list.forEach(System.out::println);

	}
}
