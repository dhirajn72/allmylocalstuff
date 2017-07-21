package com.java.test;

public class Test7 {
	static int i = 0;

	public static void main(String[] args) {

		if (i <= 10) {
			System.out.println(i);
			i++;
			main(null);
		}

	}
}
