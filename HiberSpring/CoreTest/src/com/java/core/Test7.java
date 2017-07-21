package com.java.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test7 {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		hashSet.add("ranjan");
		hashSet.add("dhiraj");
		hashSet.add("kumar");
		hashSet.add("singh");
		hashSet.add("alok");
		hashSet.add("lohar");

		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("********");
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("ranjan");
		linkedHashSet.add("dhiraj");
		linkedHashSet.add("kumar");
		linkedHashSet.add("singh");
		linkedHashSet.add("alok");
		linkedHashSet.add("lohar");
		iterator = linkedHashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
