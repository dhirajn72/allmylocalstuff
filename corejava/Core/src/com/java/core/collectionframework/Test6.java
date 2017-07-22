package com.java.core.collectionframework;

import java.util.TreeSet;

public class Test6 {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add("JSP");
		treeSet.add("Servlet");
		treeSet.add("Java");
		treeSet.add("Spring");
		treeSet.add("Hibernate");
		System.out.println(treeSet);
		TreeSet treeSet2 = new TreeSet();
		treeSet2.add(new String(new StringBuilder("sri")));
		treeSet2.add(new String(new StringBuilder("nivas")));
		treeSet2.add(new String(new StringBuilder("dande")));
		System.out.println(treeSet2);

	}
}
