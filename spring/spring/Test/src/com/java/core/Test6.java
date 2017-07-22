package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test6 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("dhiraj");
		list.add("kumar");
		list.add("singh");
		list.add("alok");
		list.add("ranjan");
		System.out.println(list);
		Collections.sort(list,new Desc());
		System.out.println(list);

	}
}

class Desc implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof String && o2 instanceof String) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s2.compareTo(s1);
		}
		return 0;
	}
}
