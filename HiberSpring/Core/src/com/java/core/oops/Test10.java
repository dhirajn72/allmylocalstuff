package com.java.core.oops;

class Super {
	private void m1() {
		System.out.println("Super-m1()");
	}

}

class Sub extends Super {
	private void m1() {
		System.out.println("Sub-m1()");

	}

	public void callm1() {
		m1();
	}

}

public class Test10 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.callm1();

	}

}
