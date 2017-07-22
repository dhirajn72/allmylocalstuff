package com.java.core.collectionframework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test12 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new StringBuilder("hello"));
		list.add(new StringBuilder("singh"));
		list.add(new StringBuilder("kumar"));
		list.add(new StringBuilder("dhiraj"));
		list.add(new StringBuilder("ajit"));
		list.add(new StringBuilder("sri"));
		System.out.println(list);
		// Collections.sort(list);
		Collections.sort(list, new SortStringBuilder());
		System.out.println(list);

	}
}

class SortStringBuilder implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}
}
