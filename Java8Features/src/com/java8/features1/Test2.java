package com.java8.features1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {

		System.out.println("main starts");
		List<String> strings = new ArrayList<String>();
		strings.add("abc");
		strings.add("def");
		strings.add("xyz");
		strings.add("xyz");
		strings.add("xyz");

		strings.add("pqr");

		strings.add("wxy");
		strings.add("jkl");

		List<String> values = getStrings(strings);
		values.forEach(u -> System.out.println(u));
		System.out.println("main ends");

	}

	public static List<String> getStrings(List<String> strings) {
		// List<String> values = strings.stream().filter(u ->
		// u.equals("xyz")).collect(Collectors.toList());

		return strings.stream().filter(u -> u.equals("xyz"))
				.collect(Collectors.toList());

		// return values;
	}

}
