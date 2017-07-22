package com.java.core;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Test17 {
	public static void main(String[] args) {
		TreeSet<StringBuffer> treeSet = new TreeSet<StringBuffer>(
				new SBComparator());
		treeSet.add(new StringBuffer("raj"));
		treeSet.add(new StringBuffer("kumar"));
		treeSet.add(new StringBuffer("sri"));
		treeSet.add(new StringBuffer("apple"));
		treeSet.add(new StringBuffer("dhiraj"));
		treeSet.add(new StringBuffer("singh"));
		System.out.println(treeSet);

		Iterator it = treeSet.iterator();
		//treeSet.add(new StringBuffer("alok"));
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

class SBComparator implements Comparator {
	@Override
	public int compare(Object object1, Object object2) {
		if (object1 instanceof StringBuffer && object2 instanceof StringBuffer) {
			String s1 = object1.toString();
			String s2 = object2.toString();
			// return s1.compareTo(s2);//ASCENDING
			return s2.compareTo(s1);// DESCENDING
		}
		return 0;
	}
}
