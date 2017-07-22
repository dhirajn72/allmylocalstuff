package com.java.string;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		Student s = new Student();
		String s1 = String.valueOf(s);
		System.out.println(s1);
		String s2 = null;
		// System.out.println(s2.isEmpty());
		String s3 = "JLC-INDIA";
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(0));

		String s4 = "My name is Dhiraj Singh";
		// changing String to character array
		char[] ch = new char[s4.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s4.charAt(i);
		}

		// System.out.println(ch);
		for (char c : ch) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println("*****");
		// changing String to byte Array

		byte[] b = new byte[s4.length()];
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) s4.charAt(i);
		}
		for (int i = 0; i < b.length; i++) {
			char c1=(char)b[i];
			System.out.print(c1);
		}
	}
}

class Student {

	@Override
	public String toString() {
		return 99 + " " + "Singh";
	}

}