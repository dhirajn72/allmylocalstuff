package com.java.string;

public class Test {

	public static void main(String[] args) {

		String st1 = "JLC";
		final String st2 = "INDIA";
		String st3 = st1 + st2;
		String st4 = "JLC" + st2;
		String st5 = st1 + "INDIA";
		String st6 = "JLC" + "INDIA";

		System.out.println(st3 == st4);
		System.out.println(st4 == st5);
		System.out.println(st5 == st6);
		System.out.println(st3 == st6);
		String s1 = String.valueOf(true);
		System.out.println(s1);
		int a = 99;
		String s2 = String.valueOf(a);
		System.out.println(s2);
		String s3 = st6.format("Hello", "HAI");
		System.out.println(s3);
		System.out.println(st6);

	}

}
