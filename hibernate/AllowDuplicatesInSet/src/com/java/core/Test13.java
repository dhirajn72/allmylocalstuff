package com.java.core;

public class Test13 {
	public static void main(String[] args) {

		try {

			int a = 10 / 0;
		} catch (Exception e) {
			e.initCause(e);
		}

	}
}
