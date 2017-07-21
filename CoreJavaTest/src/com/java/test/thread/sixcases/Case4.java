package com.java.test.thread.sixcases;

public class Case4 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Hello2D h1 = new Hello2D();
		Hello2D h2 = new Hello2D();
		
		ThreadCase4A t1 = new ThreadCase4A(h1);
		ThreadCase4B t2 = new ThreadCase4B(h2);
		t1.start();
		t2.start();

		System.out.println("main ends");

	}
}

class Hello2D {

	public synchronized void m1() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m1() called");

		}
	}

	public synchronized void m2() {
		for (int i = 0; i < 6; i++) {
			System.err.println("m2() called"); //err has been used just to print in red

		}
	}

}

class ThreadCase4A extends Thread {
	private Hello2D h1;

	public ThreadCase4A(Hello2D h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class ThreadCase4B extends Thread {
	private Hello2D h2;

	public ThreadCase4B(Hello2D h2) {
		super();
		this.h2 = h2;
	}

	@Override
	public void run() {
		h2.m2();
	}

}
