package com.java.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test8 {
	public static void main(String[] args) {
		String str1 = "my name is dhiraj and i'm dhiraj from ranchi";
		ReverseWords.reverse(str1);

		// ReverseWords.countWords(str1);
	}
}

class ReverseWords {
	public static void reverse(String string) {
		List<String> list = Arrays.asList(string.split(" "));
		for (String s1 : list) {
			System.out.print(s1 + " ");
		}
		System.out.println();
		System.out.println("*************");
		Collections.reverse(list);
		for (String s1 : list) {
			System.out.print(s1 + " ");
		}
		System.out.println();

	}

	public static void countWords(String string) {
		List<String> list = Arrays.asList(string.split(" "));
		Set<String> set = new HashSet<String>(list);
		for (String s1 : set) {
			System.out.println(s1 + "->" + Collections.frequency(list, s1));
		}
	}

}
