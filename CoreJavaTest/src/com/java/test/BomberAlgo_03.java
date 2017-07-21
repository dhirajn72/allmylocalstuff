package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BomberAlgo_03 {

	public static void main(String[] args) {

		String s1 = "dhirajsinghdhiraj";
		String s2 = "aabbccdf";
		String s3 = "dhirajdhiraj";
		System.out.println(bomberAlgo(s1));
		System.out.println(bomberAlgo(s2));
		System.out.println(bomberAlgo(s3));
		//System.out.println(bomberAlgo(null));

	}

	public static String bomberAlgo(String inputString) {

		char[] array = inputString.toCharArray();
		List<String> lists = new ArrayList<String>();
		for (char ch : array) {
			lists.add(ch + "");
		}
		Set<String> sets = new HashSet<String>(lists);
		for (String st : lists) {
			int frequency = Collections.frequency(lists, st);
			if (frequency > 1) {
				sets.remove(st);
			}
		}

		StringBuffer sb = new StringBuffer();
		for (String st : sets) {
			sb.append(st);
		}
		System.out.println("Before returning: " + sb);
		return new String(sb);

	}
}
