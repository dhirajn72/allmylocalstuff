package com.java.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class BomberAlgo {

	public static void main(String[] args) {

		String s1 = "dhirajsinghdhiraj";
		String s2 = "singh";
		System.out.println(bomberAlgo(s1));

	}

	public static Set bomberAlgo(String inputString) {
		char[] array = inputString.toCharArray();
		 List<String> list = new CopyOnWriteArrayList<String>();
		//List<String> list = new ArrayList<String>();

		for (char ch : array) {
			list.add(ch + "");
		}
		for (String st : list) {
			int frequency = Collections.frequency(list, st);
			System.out.println(st + "--->" + frequency);
			if (frequency >= 2) {
				System.out.println("removing: " + st);
				list.remove(st);
				Collections.replaceAll(list, st, "");
			}

		}
		System.out.println("Final list");
		for (String st : list) {
			System.out.println(st);

		}
		return new HashSet(list);
	}
}
