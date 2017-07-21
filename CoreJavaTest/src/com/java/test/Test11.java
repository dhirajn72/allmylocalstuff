package com.java.test;

import java.util.HashSet;
import java.util.Set;

public class Test11 {
	public static void main(String[] args) {

		int[] arr = { 23, 54, 65, 23, 76, 65, 87, 25 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (!(arr[i] == arr[j])) {
					arr2[i] = arr[i];
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println();
		System.out.println("using set");
		Set<Integer> integers = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			integers.add(arr[i]);
		}
		for (Integer integer : integers) {
			System.out.print(integer + ", ");
		}
		System.out.println("*********************");
		int array[] = { 10, 20, 30, 20, 40, 40, 50, 60, 70, 80 };// array of ten
		// elements
		int size = array.length;
		System.out.println("Size before deletion: " + size);

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] == array[j]) // checking one element with all the
				// element
				{
					while (j < (size) - 1) {
						array[j] = array[j + 1];// shifting the values
						j++;
					}
					size--;
				}
			}
		}
		System.out.println("Size After deletion: " + size);

		for (int k = 0; k < size; k++) {
			System.out.println(array[k]); // printing the values
		}
	}

}
