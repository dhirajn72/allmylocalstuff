package com.java.test.thread.sixcases;

public class Case5 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Hello2E h1 = new Hello2E();
		//Hello2D h2 = new Hello2D();
		
		ThreadCase5A t1 = new ThreadCase5A(h1);
		ThreadCase5B t2 = new ThreadCase5B(h1);
		
		t1.start();
		t2.start();

		System.out.println("main ends");

	}
}

class Hello2E {

	public static synchronized void m1() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m1() called");

		}
	}

	public static synchronized void m2() {
		for (int i = 0; i < 6; i++) {
			System.err.println("m2() called"); //err has been used just to print in red

		}
	}

}

class ThreadCase5A extends Thread {
	private Hello2E h1;

	public ThreadCase5A(Hello2E h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class ThreadCase5B extends Thread {
	private Hello2E h2;

	public ThreadCase5B(Hello2E h2) {
		super();
		this.h2 = h2;
	}

	@Override
	public void run() {
		h2.m2();
	}

}
