package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("chandu");
		list.add("dk");
		list.add("mk");
		list.add("sp");
		

		for (String ob : list) {
			String s = ob;
			System.out.println(s);
		}

	}
}
