package com.java.core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test7 {
	public static void main(String[] args) {
		Map<String, Object> map = new TreeMap<String, Object>();
		map.put("sri", "hello");
		map.put("dhiraj", "hello");
		map.put("alok", "hello");
		map.put("ranjan", "hello");
		map.put("babloo", "hello");
		System.out.println(map);
		System.out.println("**************");

		Set s = new HashSet();
		s.add("hello");
		Set set = Collections.singleton("mkd1");
		s.add("hai");
		//set.add("jlc");
		System.out.println(s);
		System.out.println(set);

	}
}
