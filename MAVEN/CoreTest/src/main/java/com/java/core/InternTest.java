package com.java.core;

public class InternTest {
	public static void main(String[] args) {

		String st1 = "JLC";
		String st2 = new String("JLC");
		String st3 = st2.intern();
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st2 == st3);

	}

}
