package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();

		System.out
				.println("The numbers which are divisible by 7 in reverse order between 1 to 300 are:");
		for (int i = 1; i < 300; i++) {
			if ((i % 7) == 0) {
				integers.add(new Integer(i));
			}
		}
		Collections.reverse(integers);
		for (Integer x : integers) {
			System.out.println(x.intValue());
		}

	}
}
