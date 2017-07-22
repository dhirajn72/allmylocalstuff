package com.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapTest {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public static void main(String[] args) {

		HashMap linkedHashMap = new HashMap();
		linkedHashMap.put("j", "hi");
		linkedHashMap.put("y", "dhiraj");
		linkedHashMap.put("t", "how");
		linkedHashMap.put("h", "are");
		linkedHashMap.put("k", "you");
		linkedHashMap.put("l", "hello");
		linkedHashMap.put("k", "alok");
		linkedHashMap.put("FB", "singh");
		linkedHashMap.put("Ea", "Kumar");
		linkedHashMap.put(4.0f, "ranjan");
		linkedHashMap.put(4.0, "kumar");
		linkedHashMap.get(4);

		System.out.println();
		Set set = new HashSet();
		System.out.println(linkedHashMap.get(4.0));
		/*
		 * System.out.println("4".hashCode());
		 * System.out.println("4.0".hashCode());
		 * System.out.println("4.0f".hashCode());
		 */
		System.out.println(linkedHashMap);
		// linkedHashMap.get("h");
		// System.out.println(linkedHashMap.get("h"));

		String s1 = "John Smith";
		String s2 = "Sandra Dee";
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		System.out.println("Hello".hashCode() == "World".hashCode());

		// new Test1().m1(4);

		List<?> list = new ArrayList<Number>();
		list = new ArrayList<Integer>();

	}

}

class Test1 {

	public void m1(Object ob) {
		System.out.println(this == ob);

	}
}
