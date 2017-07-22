package com.java8.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("singh");
		list.add("dhiraj");
		list.add("kumar");
		/*
		 * list.add(99); list.add(88.88); list.add('a');
		 */
		list.forEach(x -> System.out.println(x));

	}
}

class Test7A {

}
