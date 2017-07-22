package com.java.core;

public class Test16 {
	public static void main(String[] args) {

		Thread.yield();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Main ends");

	}
}
