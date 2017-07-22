package com.java.core;

import java.util.LinkedList;
import java.util.List;

public class CollecectionTest {
	public static void main(String[] args) {

		int[] arr = { 45, 87, 23, 76, 90, 24, 77, 34, 25, 53, 67, 78, 49 };

		LinkedList<Integer> integers = new LinkedList<Integer>();
		for (int x : arr) {
			integers.add(x);
		}

	}
}
