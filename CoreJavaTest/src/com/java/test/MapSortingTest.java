package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapSortingTest {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("xyz", 87);
		map.put("ghi", 67);
		map.put("rst", 98);
		map.put("abc", 23);
		map.put("jkl", 54);

		Set<Entry<String, Integer>> entries = map.entrySet();

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				entries);
		

		Collections.sort(list, new HashMapSortComparator());
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();

		for (Entry<String, Integer> entry : list) {
			hashMap.put(entry.getKey(), entry.getValue());
			// treeMap.put(entry.getKey(), entry.getValue());

		}
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);

		System.out.println("Before Sorting");
		System.out.println(map);
		System.out.println("*****************");
		System.out.println("After Sorting");
		System.out.println(hashMap);
		System.out.println("Tree map");
		System.out.println(treeMap);
		System.out.println(treeMap.descendingMap());

	}
}

class HashMapSortComparator implements Comparator<Entry<String, Integer>> {
	@Override
	public int compare(Entry<String, Integer> ob1, Entry<String, Integer> ob2) {
		// return ob1.getValue().compareTo(ob2.getValue());
		return ob2.getValue().compareTo(ob1.getValue());
	}
}
