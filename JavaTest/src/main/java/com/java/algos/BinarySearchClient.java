package com.java.algos;

import java.util.Arrays;

public class BinarySearchClient {

	/**
	 * Reads in a sequence of integers from the whitelist file, specified as a
	 * command-line argument; reads in integers from standard input; prints to
	 * standard output those integers that do <em>not</em> appear in the file.
	 *
	 * @param args
	 *            the command-line arguments
	 */
	public static void main(String[] args) {

		// read the integers from a file
		int[] whitelist = { 45, 23, 98, 25, 28, 21, 96, 26 };
		System.out.println(Arrays.toString(whitelist));
		// sort the array
		Arrays.sort(whitelist);
		System.out.println(Arrays.toString(whitelist));
		
	//	System.out.println("Result: "+BinarySearch.indexOf(whitelist, 28));
		
		System.out.println(BinarySearchAlgo.indexOf(whitelist, 45));
		
		
		
		

	}
}
