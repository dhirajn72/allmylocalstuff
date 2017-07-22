package com.java.core;

import java.util.Arrays;
import java.util.List;

public class Test19 {
	public static void main(String[] args) {

		String s = "this is my name";

		List<String> strings = Arrays.asList(s.split(" "));
		for (String s1 : strings) {
			StringBuilder sb = new StringBuilder(s1);
			sb.setCharAt(0, Character.toUpperCase(s1.charAt(0)));
			System.out.print(sb + " ");
		}

	}

}
