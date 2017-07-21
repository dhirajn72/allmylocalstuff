package com.java.test;

public class Test15 {
	public static void main(String[] args) throws Throwable {

		try {
			throw new Throwable("Custom thow !!");

		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println(e.getStackTrace());
			System.out.println(e.initCause(e));

		}

	}
}
