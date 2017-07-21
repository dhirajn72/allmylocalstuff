package com.java.test.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test6 {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put(123, "Dhiraj");
		map.put(876, "Dhiraj");
		map.put(765, "kumar");
		map.put(126, "Dhiraj");

		System.out.println("*************");
		map.forEach((k, v) -> {
			System.out.println(k + ":" + v);

		});

		System.out.println("*************");

		System.out.println(map);
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {

			Map.Entry entry = (Entry) it.next();
			Integer key = (Integer) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + " -> " + value);

		}

	}
}
