package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test16 {
	public static void main(String[] args) throws Throwable {
		String str = "JAVA J2EE";

		char[] ch = str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : ch) {
			list.add(c);
		}
		Set<Character> set = new HashSet<Character>(list);
		for (char o : set) {
			System.out.println(o + " -->" + Collections.frequency(list, o));

		}

	}
}
