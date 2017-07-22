package com.java.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("kumar");
		list.add("singh");
		list.add("kumar");
		list.add("singh");
		list.add("alok");
		list.add("singh");
		list.add("ranjan");
		list.add("singh");
		System.out.println(list);
		Set set1 = new HashSet(list);
		System.out.println(set1);
		System.out.println("*********");
		RemoveDupli.remove(list);

	}
}

class RemoveDupli {
	public static void remove(List list) {
		List list2 = new ArrayList();
		Set set = new HashSet();
		for (Object ob : list) {
			if (!set.contains(ob)) {
				set.add(ob);
				list2.add(ob);
			}

		}
		// System.out.println(set);
		System.out.println("After removing duplicates:");
		for (Object ob : list2) {
			System.out.println(ob);
		}
	}

}
