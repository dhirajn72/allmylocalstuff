package com.java.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("dk");
		hashSet.add("dk");
		hashSet.add("dk");
		hashSet.add("dk");
/*		hashSet.add("mk");
		hashSet.add("sk");*/
		

		Map<Student, HashSet> map = new HashMap<Student, HashSet>();
		map.put(new Student(99, "dk"), hashSet);
		map.put(new Student(99, "dk"), hashSet);
		map.put(new Student(99, "dk"), hashSet);
		map.put(new Student(99, "dk"), hashSet);
		System.out.println(map);
	}

}
