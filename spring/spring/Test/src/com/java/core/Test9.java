package com.java.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {
		String str = "my name is dhiraj and i'm from ranchi";
		Test9A.reverse(str);
	}
}

class Test9A {
	public static void reverse(String string) {

		char[] arr1 = string.toCharArray();
		char[] arr2 = new char[arr1.length];
		int j = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			arr2[j] = arr1[i];
			j++;
		}
		System.out.println(string);
		String st2 = String.valueOf(arr2);
		//System.out.println(st2);
		List<String> list = Arrays.asList(st2.split(" "));
		Collections.reverse(list);
		for (String s2 : list) {
			System.out.print(s2 + " ");
		}
		System.out.println();
	}
}
