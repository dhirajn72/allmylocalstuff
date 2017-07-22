package com.java.core.collectionframework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class Test13 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("dk");
		list.add("singh");
		list.add("kumar");
		list.add("manish");
		list.add("sri");
		list.add("nivas");
		list.add("dande");
		list.add("sushma");

		System.out.println(list);
		list.add(3, "New Element");
		List unmodList = Collections.unmodifiableList(list);
		// unmodList.add("chotu");
		// System.out.println(unmodList);
		System.out.println(list);

		Properties properties = new Properties();
		properties.put(88, "dk");
		properties.put(98, "singh");
		properties.put(45, "dhiraj");
		properties.put(53, "kumar");
		Enumeration enumeration = properties.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

	}
}
