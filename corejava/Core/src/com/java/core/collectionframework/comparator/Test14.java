package com.java.core.collectionframework.comparator;

import java.util.Arrays;
import java.util.List;

public class Test14 {
	public static void main(String[] args) {

		int[] arr1 = { 67, 98, 34, 76, 12, 43, 53 };
		System.out.println(arr1);
		int[] arr2 = { 87, 84, 24, 75, 25, 97, 24, 76, 99 };
		System.out.println(Arrays.equals(arr1, arr2));

		// 87,84,24,75,25,97,24,76,99
		List list = Arrays.asList(arr1);
		System.out.println(list);

	}
}
