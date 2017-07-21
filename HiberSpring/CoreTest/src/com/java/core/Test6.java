package com.java.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test6 {
	public static void main(String[] args) {

		String str = "Himalaya is the highest mountain in the world";
		List list = Arrays.asList(str.split(""));

		Set set = new HashSet(list);
		set.remove("");
		for (Object ob : set) {
			System.out.println(ob + " " + Collections.frequency(list, ob));
		}

	}
}
