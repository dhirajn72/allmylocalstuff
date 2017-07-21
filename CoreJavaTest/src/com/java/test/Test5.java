package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("48".hashCode());
		System.out.println("ABC".hashCode());
		System.out.println("21".hashCode());

		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(null, "dhiraj");
		map.put(null, "singh");
		map.put(null, "kumar");
		System.out.println(map.get(null));
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "dhiraj");
		map2.put(5, "singh");
		map2.put(1, "kumar");

		Set<Integer> set = map2.keySet();
		for(int ob:set){
			System.err.println(map2.get(ob));
		}
		
		

		Multimap<Object, Object> multimap = ArrayListMultimap.create();
		multimap.put(null, "dhiraj");
		multimap.put(null, "singh");
		System.out.println("****");
		System.out.println(multimap.get(null));

	}
}
