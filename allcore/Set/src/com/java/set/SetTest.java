package com.java.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class SetTest {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		hashSet.add("hello");
		hashSet.remove("hai");
		System.out.println(hashSet);
		HashSet hashSet2 = new HashSet(2);
		hashSet2.add("hello");
		hashSet2.add("hello");
		hashSet2.add("hello");
		System.out.println(hashSet2);

		LinkedHashSet linkedHashSet = new LinkedHashSet();

		LinkedHashMap linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("g", "hello");
		linkedHashMap.put("d", "hai");
		linkedHashMap.put("e", "hi");
		System.out.println(linkedHashMap);

		LinkedList linkedList = new LinkedList();
		linkedList.add("zebra");
		linkedList.add("apple");
		linkedList.add("hero");
		// linkedList.add(1, "dk");
		List list = new LinkedList();
		System.out.println(linkedList);

	}
}
