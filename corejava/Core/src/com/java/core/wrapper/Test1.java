package com.java.core.wrapper;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int a = 99;
		Integer integer = new Integer(88);
		System.out.println(a + " " + integer);
		System.out.println(a == integer);

		int x = integer.intValue();
		System.out.println(x);
		double d = 99.99;
		String s = Double.toString(d);
		System.out.println(d + " " + s);

		String s1 = "88";
		Byte byte1 = new Byte(s1);
		System.out.println(byte1);

	}
}
