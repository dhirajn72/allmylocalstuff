package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test7 {
	public static void main(String[] args) {
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
		WordCount.count(list);
	}
}

class WordCount {

	public static void count(List<String> list) {
		List<String> list2 = list;
		Set<String> set = new HashSet<String>(list2);
		for (String s1 : set) {
			System.out.println(s1 + "->" + Collections.frequency(list2, s1));
		}

	}
}