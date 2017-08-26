package com.java.algos.sort;

import java.util.Arrays;

/**
 * @author dhiraj
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 67, 12, 34, 98, 25, 65, 78 };

		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Selection_Sort.sort(arr);
		System.out.println("After Sorting");
		Selection_Sort.printArray(arr);

	}

}

/**
 * @author dhiraj
 *
 */
class Selection_Sort {

	/**
	 * @param arr
	 */
	public static void sort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {

			int mid_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[mid_idx]) {
					mid_idx = j;
				}
			}
			int temp = arr[mid_idx];
			arr[mid_idx] = arr[i];
			arr[i] = temp;

		}
	}

	/**
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}

	}

}
