package com.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test3 {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		list.add("dk");
		list.add("ch");
		Iterator<String> iterator = list.iterator();
		list.add("add");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("_________________");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a ", "dk");
		map.put(" a", "dk");
		map.put(" a ", "dk");
		System.out.println(map);
		Set<java.util.Map.Entry<String, Object>> list2 = map.entrySet();
		System.out.println(list2);

	}
}
