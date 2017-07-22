package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add("hai");
		arrayList.add("dhiraj");
		arrayList.add("how");
		arrayList.add("are");
		arrayList.add("you");
		System.out.println(arrayList);
		Collections.sort(arrayList, new StringComparator());
		System.out.println(arrayList);

	}

}

class StringComparator implements Comparator {
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
