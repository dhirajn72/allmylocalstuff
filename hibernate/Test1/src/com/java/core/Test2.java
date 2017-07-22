package com.java.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 10);
		map.put('B', 20);
		System.out.println("Enter values to print key:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> en : set) {
			if (en.getValue() == x) {
				System.out
						.println("Key for the given value is: " + en.getKey());
			}
		}

	}
}