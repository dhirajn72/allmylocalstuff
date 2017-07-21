package com.java.test.exceptions;

public class Test1 {
	public static void main(String[] args) {

		try {
			int a = 10 / 0;

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
