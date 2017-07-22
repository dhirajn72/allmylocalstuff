package com.java.core.collectionframework.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		List col = new ArrayList();
		col.add("jsp");
		col.add("jdbc");
		col.add("java");
		col.add("core");
		col.add("spring");
		col.add("hibernate");
		col.add("xml");
		col.add("servlets");
		System.out.println(col);
		// Collections.reverse(col);
		// System.out.println(col);
		// Collections.shuffle(col);
		// System.out.println(col);

		// Collections.rotate(col, 2);
		// System.out.println(col);
		Collections.sort(col);
		System.out.println(col);
		Collections.sort(col, new DescSort());
		System.out.println(col);

	}

}

class DescSort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		String s = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s);
	}
}