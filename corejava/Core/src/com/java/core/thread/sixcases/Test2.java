package com.java.core.thread.sixcases;

public class Test2 {

	public static void main(String[] args) {
		Hello2 hello2 = new Hello2();
		// Hello1 hello2 = new Hello1();
		Thread2A thread2a = new Thread2A(hello2);
		Thread2B thread2b = new Thread2B(hello2);
		thread2a.start();
		thread2b.start();

	}

}

class Thread2A extends Thread {
	Hello2 h1;

	public Thread2A(Hello2 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class Thread2B extends Thread {
	Hello2 h1;

	public Thread2B(Hello2 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m2();
	}
}

class Hello2 {
	public void m1() {
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