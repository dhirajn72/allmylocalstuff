package com.java.core.thread.sixcases;

public class Test5 {

	public static void main(String[] args) {
		Hello5 hello5 = new Hello5();

		Thread5A thread5a = new Thread5A(hello5);
		Thread5B thread5b = new Thread5B(hello5);
		thread5a.start();
		thread5b.start();

	}

}

class Thread5A extends Thread {
	Hello5 h1;

	public Thread5A(Hello5 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class Thread5B extends Thread {
	Hello5 h1;

	public Thread5B(Hello5 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m2();
	}
}

class Hello5 {
	public static synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}

	}

	public synchronized void m2() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}
	}
}