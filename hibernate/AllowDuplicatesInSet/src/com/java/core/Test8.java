package com.java.core;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Test8 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("hai");
		list.add("hellohai");
		ListIterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.nextIndex() + "->" + iterator.next());
			System.out.println();
		}
		System.out.println(list);
		System.out.println("******Enumeration********");
		Vector vector = new Vector();
		vector.add("hello");
		vector.add("hai");
		vector.add("hellohai");

		Enumeration enumeration = vector.elements();
		vector.add("added");
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
		}

	}
}
