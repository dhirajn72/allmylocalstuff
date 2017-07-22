package com.java.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test9 {
	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("hello");
		set.add("hai");
		set.add("hellohai");
		System.out.println(set);

		List list = new ArrayList();
		list.addAll(set);
		list.add("sri");
		list.add("dk");
		list.add("nivas");
		System.out.println(list);

	}
}
