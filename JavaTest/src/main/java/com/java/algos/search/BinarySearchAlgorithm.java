package com.java.algos.search;

import java.util.Arrays;

/**
 * @author dhiraj
 *
 */
public class BinarySearchAlgorithm {

	public static int indexOf(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid= low+(high-low)/2;
			if(key<arr[mid])high=mid-1;
			else if(key>arr[mid])low=mid+1;
			else return mid;
		}

		return -1;

	}

}
