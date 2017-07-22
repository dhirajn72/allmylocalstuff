package com.java.string;

public class Test {
	public static void main(String[] args) {
		String str = "anything";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
	}
}
