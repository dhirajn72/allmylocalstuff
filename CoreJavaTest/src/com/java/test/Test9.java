package com.java.test;

import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Sum: " + sum);

		int half = sum / 2;
		System.out.println("Half: " + half);

		
		if (half % 2 == 0) {
			int sumHalf = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				sumHalf += arr[i];
				if (half == sumHalf) {
					System.out.println("Found middle element!!");
					System.out.println("Index is: " + i);
				}
			}
		} else {
			System.err.println("Errror !!");
		}
	}
}
