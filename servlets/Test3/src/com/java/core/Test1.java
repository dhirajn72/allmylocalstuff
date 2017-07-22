package com.java.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {

		String str = "java is the best language and this is best ammong all the language";
		RemoveDuplicates.remove(str);

	}

}

class RemoveDuplicates {

	public static void remove(String str) {
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		while (stringTokenizer.hasMoreTokens()) {
			String str1 = stringTokenizer.nextToken();
			if (set.add(str1)) {
			} else {
				list.add(str1);
			}
		}
		System.out.println("Original String:");
		System.out.println(str);
		System.out.println("Unique elements are:");
		for (String st1 : set) {
			System.out.print(st1 + " ");
		}
		System.out.println();
		System.out.println("****************");
		System.out.println("Duplicate elements are:");
		for (String st1 : list) {
			System.out.print(st1 + " ");
		}
	}
}
