package com.java.test.thread.sixcases;

public class Case3 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Hello2C h = new Hello2C();
		ThreadCase3A t1 = new ThreadCase3A(h);
		ThreadCase3B t2 = new ThreadCase3B(h);
		t1.start();
		t2.start();

		System.out.println("main ends");

	}
}

class Hello2C {

	public synchronized void m1() {
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

class ThreadCase3A extends Thread {
	private Hello2C h1;

	public ThreadCase3A(Hello2C h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class ThreadCase3B extends Thread {
	private Hello2C h2;

	public ThreadCase3B(Hello2C h2) {
		super();
		this.h2 = h2;
	}

	@Override
	public void run() {
		h2.m2();
	}

}
