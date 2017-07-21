package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author dhiraj
 *
 */
public class OrderByValue {

	/**
	 * @param a
	 */
	public static void main(String a[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Set<Entry<String, Integer>> set = map.entrySet();

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				set);
		System.out.println("List is: " + list);
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
		System.out.println("**************");

		Collections.sort(list, new HasMapComparator());

		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}
}

/**
 * @author dhiraj
 *
 */
class HasMapComparator implements Comparator<Entry<String, Integer>> {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return (o2.getValue()).compareTo(o1.getValue()); // descending order of
															// value
		// return (o1.getValue()).compareTo(o2.getValue()); // ascending order
		// of
		// values
	}

}
