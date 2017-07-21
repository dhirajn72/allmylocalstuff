package com.java.test.thread.sixcases;

public class Case1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Hello1 h = new Hello1();
		ThreadCase1 t1 = new ThreadCase1(h);
		ThreadCase2 t2 = new ThreadCase2(h);
		t1.start();
		t2.start();

		System.out.println("main ends");

	}
}

class Hello1 {

	public synchronized void m1() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m1() called");

		}

	}

	public synchronized void m2() {
		for (int i = 0; i < 6; i++) {
			System.out.println("m2() called");

		}
	}

}

class ThreadCase1 extends Thread {
	private Hello1 h1;

	public ThreadCase1(Hello1 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class ThreadCase2 extends Thread {
	private Hello1 h2;

	public ThreadCase2(Hello1 h2) {
		super();
		this.h2 = h2;
	}

	@Override
	public void run() {
		h2.m2();
	}

}
