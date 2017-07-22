package com.java.core.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test2 {

	public static void main(String[] args) {

		LinkedList arrayList = new LinkedList();
		arrayList.add("JSP");
		arrayList.add("JDBC");
		arrayList.add("Spring");
		arrayList.add("JSF");
		arrayList.add("Struts");
		arrayList.add("WebServices");
		arrayList.add("Hibernate");
		arrayList.add("XML");
		arrayList.add("Core Java");

		ListIterator it = arrayList.listIterator();
		// arrayList.add("ADDED");//ConcurrentModificationException
		System.out.println("***Forward Direction***");
		while (it.hasNext()) {
			System.out.println(it.nextIndex() + "->" + it.next());
		}
		System.out.println("***Previous Direction**");
		while (it.hasPrevious()) {
			System.out.println(it.previousIndex() + "->" + it.previous());
		}
		System.out.println("**************");
		ListIterator iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.nextIndex() + "->" + iterator.next());
			
		}
		System.out.println("**************************");
		Iterator iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}
}
