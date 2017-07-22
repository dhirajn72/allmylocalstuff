package com.java.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test6 {
	public static void main(String[] args) {

		Map<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(99, "hello");
		map.put(new Integer(99), "hai");
		map.put(new Integer(99), "hellohai");
		System.out.println(map);

		Collection<Object> list = map.values();
		System.out.println(list);
		List list2 = new ArrayList(list);
		System.out.println(list2);
		System.out.println("*****************************");
		Set set = map.entrySet();
		List list3 = new ArrayList(set);
		System.out.println(list3);

	}
}
