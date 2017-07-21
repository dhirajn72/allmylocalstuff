package com.java.test.generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(8758);
		list1.add(234);
		list1.add(655);
		list1.add(7897);

		ArrayList<Float> floats = new ArrayList<Float>();
		floats.add(new Float(243.56));
		floats.add(new Float(3443.56));
		floats.add(new Float(243.656));
		floats.add(new Float(986.233));

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("jjkj");
		strings.add("jhj");
		strings.add("erty");
		strings.add("poiuy");

		// List<?> list = list1;
		//List<?> list = floats;
		List<?> list = strings;
		for (Object ob : list) {
			System.out.println(ob);

		}

	}

}
