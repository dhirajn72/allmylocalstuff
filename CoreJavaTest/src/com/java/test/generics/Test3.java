package com.java.test.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Float> floats = new ArrayList<Float>();
		floats.add(new Float(243.56));
		floats.add(new Float(3443.56));
		floats.add(new Float(243.656));
		floats.add(new Float(986.233));
		System.out.println("**********");
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(8758);
		integers.add(234);
		integers.add(655);
		integers.add(7897);

		// List<? extends Number> list = floats;
		List<? extends Number> list = integers;
		for (Object ob : list) {
			System.out.println(ob);
		}

	}

}
