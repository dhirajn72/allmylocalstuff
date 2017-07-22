package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hai");
		list.add("hello");
		list.add("kumar");
		list.add("hello");
		list.add("singh");
		list.add("hello");
		list.add("kumar");
		list.add("kumar");
		list.add("hello");
		list.add("hello");
		list.add("dk");
		list.add("dk");
		DupsCount.count(list);
	}
}

class DupsCount {
	public static void count(List<String> list) {

		Set<String> set = new HashSet<String>();
		List<String> list1 = new ArrayList<String>();

		for (String s1 : list) {
			if (set.add(s1)) {

			} else {
				list1.add(s1);
			}
		}
		System.out.println("All words:->" + list);
		System.out.println("Unique words:->" + set);
		System.out.println("Duplicate words:->" + list1);

	}
}
