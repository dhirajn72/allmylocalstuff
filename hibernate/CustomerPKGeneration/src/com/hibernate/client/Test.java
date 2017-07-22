package com.hibernate.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		String[] str = { "singh", "dk", "dhiraj", "kumar", "singh", "sri", "dk" };
		List list = new ArrayList();

		HashSet hashSet = new HashSet();

		for (String ele : str) {
			if (hashSet.contains(ele)) {
				list.add(ele);
			}
			hashSet.add(ele);
		}
		System.out.println("Unique:" + hashSet);
		System.out.println("Duplicates:" + list);
	}
}
