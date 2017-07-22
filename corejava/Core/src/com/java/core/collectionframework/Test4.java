package com.java.core.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		
		HashSet hashSet=new HashSet();
		hashSet.add(null);
		System.out.println(hashSet);

		LinkedHashSet linkedHashSet=new LinkedHashSet();
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		TreeSet treeSet=new TreeSet();
		//treeSet.add(null);
		NavigableSet navigableSet=new TreeSet();
		//navigableSet.add(null);
		
		
	}

}
