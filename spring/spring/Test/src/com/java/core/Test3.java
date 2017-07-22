package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {

		String str = "Hello this is Hello Hello this is Hello Hello this is Hello";
		CountDuplicates.count(str);

		System.out.println("************");
		List<String> list = new ArrayList<String>();
		list.add("alok");
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("alok");
		list.add("alok");
		list.add("ranjan");
		list.add("ranjan");
		list.add("alok");
		list.add("lohar");
		list.add("lohar");
		list.add("lohar");
		list.add("lohar");
		list.add("alok");
		list.add("alok");

		Set<String> set = new HashSet<String>(list);
		for (String s1 : set) {
			System.out.println(s1 + "->" + Collections.frequency(list, s1));
		}

	}

}

class CountDuplicates {
	public static void count(String string) {
		List<String> list = Arrays.asList(string.split(" "));
		Set<String> set = new HashSet<String>(list);
		for (String s1 : set) {
			System.out.println(s1 + "->" + Collections.frequency(list, s1));
		}

	}
}
