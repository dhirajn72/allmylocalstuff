package com.java.test.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Test5 {
	public static void main(String[] args) {

		Set<String> set = new CopyOnWriteArraySet<String>();
		//Set<String> set = new HashSet<String>(); // java.util.ConcurrentModificationException
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		Iterator it = set.iterator();
		while (it.hasNext()) {
			set.remove("c");
			
			System.out.println(it.next());
			

		}
		/*
		while (it.hasNext()) {
			System.out.println(it.next());

		}
*/
	}

}
