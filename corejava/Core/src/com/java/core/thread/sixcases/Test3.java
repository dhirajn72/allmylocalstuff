package com.java.core.thread.sixcases;

public class Test3 {

	public static void main(String[] args) {
		Hello3 hello3 = new Hello3();
		// Hello1 hello2 = new Hello1();

		Thread3A thread3a = new Thread3A(hello3);
		Thread3B thread3b = new Thread3B(hello3);
		thread3a.start();
		thread3b.start();

	}

}

class Thread3A extends Thread {
	Hello3 h1;

	public Thread3A(Hello3 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class Thread3B extends Thread {
	Hello3 h1;

	public Thread3B(Hello3 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m2();
	}
}

class Hello3 {
	public synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}

	}

	public void m2() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}
	}
}