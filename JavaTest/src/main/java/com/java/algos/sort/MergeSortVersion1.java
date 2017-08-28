package com.java.algos.sort;

public class MergeSortVersion1 {

	public static void main(String a[]) {

		// int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		int[] inputArr = { 45, 23, 11 };
		// MergeSort mms = new MergeSort();
		// mms.sort(inputArr);
		MergeSortAlgo.sort(inputArr);

		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}

class MergeSortAlgo {

	private static int[] array;
	private static int[] tempArr;
	private static int length;

	public static void sort(int[] inputArr) {
		array = inputArr;
		length = inputArr.length;
		tempArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private static void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempArr[i] <= tempArr[j]) {
				array[k] = tempArr[i];
				i++;
			} else {
				array[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempArr[i];
			k++;
			i++;
		}

	}
}