package com.java.core;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("Main:" + Empl.b);
	}
}

class Empl {
	static {
		System.out.println("SB1:" + Empl.b);
	}
	static int b = 99;
	static {
		System.out.println("SB2:" + b);
	}

}
