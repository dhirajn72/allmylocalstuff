package com.java8.core;

import java.util.Arrays;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println(integers.stream().filter(e -> e % 2 != 0).toArray()

		);

	}
}
