package com.java.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
//		TreeSet set = new TreeSet(new SBComparator());
		ArrayList set = new ArrayList();
		set.add(new StringBuilder("dhiraj"));
		set.add(new StringBuilder("singh"));
		set.add(new StringBuilder("kumar"));
		set.add(new StringBuilder("ram"));

		System.out.println(set);
		
		Collections.sort(set, new SBComparator());
		System.out.println(set);
		

	}
}

class SBComparator implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		if (ob1 instanceof StringBuilder && ob2 instanceof StringBuilder) {
/*			String s1 = new String((StringBuilder) ob1);
			String s2 = new String((StringBuilder) ob2);
*/			String s1 =  ob1.toString();
			String s2 = ob2.toString();
			//return s1.compareTo(s2);
			return s2.compareTo(s1);
		}
		return 0;
	}
}
