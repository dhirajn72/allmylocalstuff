package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Test11 {
	public static void main(String[] args) {
		String str = "my name is dhiraj singh and i am staying in bangalore";
		// List list = new ArrayList();

		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		/*
		 * while (stringTokenizer.hasMoreTokens()) {
		 * //System.out.print(stringTokenizer.nextElement()+" ");
		 * list.add(stringTokenizer.nextToken()); }
		 */

		List list = Arrays.asList(str.split(" "));
		for (Object ob : list) {
			System.out.print(ob + " ");
		}
		System.out.println();
		Collections.reverse(list);
		for (Object ob : list) {
			System.out.print(ob + " ");
		}
	}
}
