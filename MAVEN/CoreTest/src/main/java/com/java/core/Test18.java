package com.java.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test18 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(35);
		list.add(23);
		list.add(54);
		list.add(13);
		list.add(76);
		list.add(90);
		list.add(54);
		list.add(13);

		Set set = new HashSet();
		List list2 = new ArrayList();
		for (Object ob : list) {
			if (!set.add(ob)) {
				list2.add(ob);
			}
		}

		System.out.println("Unique elements:");
		System.out.println(set);

		System.out.println("Duplicates elements:");
		System.out.println(list2);

	}
}
