package com.java.algos.sort;

import java.util.Arrays;

/**
 * @author dhiraj
 *
 */
public class BubbleSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] arr = { 64,11, 34,12, 25, 12, 22, 11, 90 };
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Bubble_Sort.sort(arr);
		System.out.println("After Sorting");
		Bubble_Sort.printArray(arr);

	}

}

/**
 * @author dhiraj
 *
 */
class Bubble_Sort {

	/**
	 * @param arr
	 */
	public static void sort(int[] arr) {

		int len = arr.length;

		for (int i = 0; i < len - 1; i++)
			for (int j = i + 1; j < len; j++)
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

	}

	/**
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for (int val : arr)
			System.out.println(val);

	}

}
