package com.java.core;

class Lab {

	public static void main(String[] args) {
		System.out.println("main()");

	}

	static {
		System.out.println("Lab-SB");
	}

}

class Test7 extends Lab {
	static {
		System.out.println("Test7-SB");
	}

}
