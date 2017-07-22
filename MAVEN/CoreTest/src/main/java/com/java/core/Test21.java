package com.java.core;

import java.util.Arrays;
import java.util.List;

public class Test21 {
	public static void main(String[] args) {

		String s1 = "this is test";
		System.out.println(s1);

		List<String> strings = Arrays.asList(s1.split(" "));
		for (String s : strings) {
			StringBuilder sb = new StringBuilder(s);
			sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
			System.out.print(sb + " ");
		}

	}
}
