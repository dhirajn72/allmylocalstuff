package com.java.core.collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("JSP");
		set.add("JDBC");
		set.add("Spring");
		set.add("JSF");
		set.add("Struts");
		set.add("WebServices");
		set.add("Hibernate");
		set.add("XML");
		set.add("Core Java");

		Iterator iterator = set.iterator();
		// set.add("ADDED");//ConcurrentModificationException
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("***********");

	}

}
