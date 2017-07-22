package com.java.core;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<Integer>();
		/*
		 * set.add("ranjan"); set.add("singh"); set.add("kumar");
		 * set.add("dhiraj"); set.add("alok"); set.add("lohar");
		 */
		set.add(88);
		set.add(45);
		set.add(43);
		set.add(98);
		set.add(31);
		set.add(12);
		for (Object ob : set) {
			System.out.println(ob);
		}
		//set=set.descendingSet();
		System.out.println(set);

	}
}
