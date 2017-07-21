package com.java.test.thread.sixcases;

public class Case6 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Hello2F h1 = new Hello2F();
		// Hello2F h2 = new Hello2F(); // question1
		Hello2F h2 = new Hello2F();

		ThreadCase6A t1 = new ThreadCase6A(h1);
		// ThreadCase6B t2 = new ThreadCase6B(h1); //question1
		ThreadCase6B t2 = new ThreadCase6B(h1);  //question2
		

		t1.start();
		t2.start();

		System.out.println("main ends");

	}
}

class Hello2F {

	public static synchronized void m1() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m1() called");

		}
	}

	public static synchronized void m2() {
		for (int i = 0; i < 6; i++) {
			System.err.println("m2() called"); // err has been used just to
												// print in red

		}
	}

}

class ThreadCase6A extends Thread {
	private Hello2F h1;

	public ThreadCase6A(Hello2F h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class ThreadCase6B extends Thread {
	private Hello2F h2;

	public ThreadCase6B(Hello2F h2) {
		super();
		this.h2 = h2;
	}

	@Override
	public void run() {
		Hello2F.m2();
	}

}
