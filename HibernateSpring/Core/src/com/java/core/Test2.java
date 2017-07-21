package com.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test2 {
	public static void main(String[] args) {

		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put(99, "Hello1");
		map.put(99, "Hello2");
		map.put(99, "Hello3");
		System.out.println(map);
		map.get(99);

		HashSet<String> set = new HashSet<String>();
		set.add("hello1");
		set.add("hello2");
		set.add("hello3");
		System.out.println(set);

	}

}
