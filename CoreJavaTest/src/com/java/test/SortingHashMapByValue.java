package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortingHashMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("def", 97);
		map.put("xyz", 87);
		map.put("pqr", 34);
		map.put("bcd", 67);
		map.put("abc", 23);
		map.put("mno", 99);

		System.out.println(map);
		map = getMapSortedByValue(map);
		System.out.println(map);

	}

	public static Map<String, Integer> getMapSortedByValue(
			Map<String, Integer> map) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				entries);

		Collections.sort(list, new HashMapComparator_Test19());
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(
				list.size());
		for (Entry<String, Integer> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
			// map.put(entry.getKey(), entry.getValue()); //This wont work

		}
		return linkedHashMap;

	}

}

class HashMapComparator_Test19 implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> ob1, Entry<String, Integer> ob2) {
		return ob1.getValue().compareTo(ob2.getValue());
		// return ob2.getValue().compareTo(ob1.getValue());

	}
}
