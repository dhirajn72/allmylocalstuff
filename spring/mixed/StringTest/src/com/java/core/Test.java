package com.java.core;

public class Test {

	public static void main(String[] args) {

		/*
		 * String str1="JLC-001"; String str2=str1.substring(4);
		 * System.out.println(Integer.parseInt(str2)+1);
		 */

		System.out.println("main starts");
		try {
			new Thread1().start();

		} catch (Exception e) {
			System.out.println("exception has been raised");
		}
		System.out.println("main ends");

	}

}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("run()");
		throw new RuntimeException();
	}
}
