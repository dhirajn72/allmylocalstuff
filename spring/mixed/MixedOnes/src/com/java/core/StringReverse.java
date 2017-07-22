package com.java.core;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str1 = sc.nextLine();
		char[] arr = str1.toCharArray();
		char[] arr2 = new char[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--, j++) {
			arr2[j] = arr[i];
		}
		String str2 = String.valueOf(arr2);
		System.out.println("Old String:" + str1);
		System.out.println("Reversed String:" + str2);
		System.out.println("**************");

		StringTokenizer stringTokenizer = new StringTokenizer(str1, " ");
		String[] arr3 = new String[stringTokenizer.countTokens()];
		for (int i = arr3.length - 1; i >= 0; i--) {
			if (stringTokenizer.hasMoreTokens()) {
				arr3[i] = stringTokenizer.nextToken();
			}
		}
		System.out.println("*************");
		for (String st : arr3) {
			System.out.print(st + " ");
		}
		System.out.println();
		System.out.println("***********");
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = sb1.reverse();
		System.out.println(sb2);

	}

}
