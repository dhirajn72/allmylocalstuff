package com.java.test.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		TreeSet set= new TreeSet();
		set.add(new String(new StringBuffer("dhiraj")));
		set.add(new String(new StringBuffer("singh")));
		set.add(new String(new StringBuffer("kumar")));
		set.add(new String(new StringBuffer("rajput")));
		
		System.out.println(set);
		/*
		 * Collections.reverseOrder() can be used to store string Object 
		 * in descending sorted order
		*/
		//TreeSet set2 = new TreeSet(Collections.reverseOrder());
		TreeSet set2 = new TreeSet();
		set2.add("kumar");
		set2.add("ankur");
		set2.add("punit");
		set2.add("rahul");
		set2.add("dhiraj");
		
		set2 = (TreeSet)set2.descendingSet();
		
		System.out.println(set2);
		
		
		

	}
}
