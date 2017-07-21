package com.java.test.thread.sixcases;

public class Case2 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Hello2B h = new Hello2B();
		ThreadCase2A t1 = new ThreadCase2A(h);
		ThreadCase2B t2 = new ThreadCase2B(h);
		t1.start();
		t2.start();

		System.out.println("main ends");

	}
}

class Hello2B {

	public void m1() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m1() called");

		}
	}

	public void m2() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m2() called");

		}
	}

}

class ThreadCase2A extends Thread {
	private Hello2B h1;

	public ThreadCase2A(Hello2B h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class ThreadCase2B extends Thread {
	private Hello2B h2;

	public ThreadCase2B(Hello2B h2) {
		super();
		this.h2 = h2;
	}

	@Override
	public void run() {
		h2.m2();
	}

}
