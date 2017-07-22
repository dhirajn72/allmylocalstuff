package com.java.core.collectionframework.comparator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test8 {
	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(7.7, "hello");
		map.put(7.8f, "singh");
		map.put(7.4, "dk");
		map.put(7.1d, "kumar");
		map.put(7.0, "chandu");
		map.put(.0000001, "chandu");

		Set set = map.keySet();
		for (Object ob : set) {
			System.out.println(ob + "->" + map.get(ob));
		}

		System.out.println("******************");
		Collection col = map.values();
		Iterator it = col.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***********************");
		Set set2 = map.entrySet();
		Iterator iterator = set2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
