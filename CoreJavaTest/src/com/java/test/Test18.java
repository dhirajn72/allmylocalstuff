package com.java.test;

public class Test18 {
	public static void main(String[] args) {
		Object test18a = new Test18A();
		System.out.println(test18a instanceof Test18A);
		test18a = null;
		System.out.println(test18a instanceof Test18A);

	}
}

class Test18A {

}
