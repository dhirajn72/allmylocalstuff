package com.java.test.collection;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(map, "99");
	//	map.put(map, "99"); Stack overflow error
		map.put(99, map);
		map.put(97, map);
		map.put(93, map);
		map.put(95, map);
		
		System.out.println(map);
	}
}
