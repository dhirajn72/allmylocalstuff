package com.java.core;

public class Test2 {

	public static void main(String[] args) {
		String str = "vostro";
		char[] arr = str.toCharArray();
		char[] arr1 = new char[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			arr1[j] = arr[i];
			j++;
		}
		System.out.println();
		System.out.println("------------------");
		System.out.println("Original String:" + String.valueOf(arr));
		System.out.println("Reversed String:" + String.valueOf(arr1));

	}
}
