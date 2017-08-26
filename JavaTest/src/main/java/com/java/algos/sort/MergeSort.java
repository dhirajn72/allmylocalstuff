package com.java.algos.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 67, 12, 34, 98, 25, 65, 78 };

		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Merge_sort.sort(arr, 0, arr.length - 1);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

	}
}

class Merge_sort {

	public static void sort(int[] arr, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);

			System.out.println("mid: " + mid);
			merge(arr, low, mid, high);

		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high - mid;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}