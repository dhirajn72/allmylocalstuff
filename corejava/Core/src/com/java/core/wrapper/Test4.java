package com.java.core.wrapper;

public class Test4 {
	public static void main(String[] args) {
		int a = 99;
		String s = String.valueOf(a);
		System.out.println(s);
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		int y = i.intValue();
		System.out.println(y);

	}
}
