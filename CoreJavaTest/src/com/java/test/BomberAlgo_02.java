package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class BomberAlgo_02 {

	public static void main(String[] args) {

		String s1 = "dhirajsinghdhiraj";
		System.out.println(bomberAlgo(s1));

	}

	public static String bomberAlgo(String inputString) {
		char[] array = inputString.toCharArray();
		List<String> list = new CopyOnWriteArrayList<String>();

		for (char ch : array) {
			list.add(ch + "");
		}
		for (String st : list) {
			int frequency = Collections.frequency(list, st);
			if (frequency > 1) {
				list.removeAll(Collections.singleton(st));
			}
		}
		StringBuffer sb = new StringBuffer();
		for (String st : list) {
			sb.append(st);

		}
		return new String(sb);
	}
}
