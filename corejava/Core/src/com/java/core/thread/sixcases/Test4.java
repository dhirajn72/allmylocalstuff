package com.java.core.thread.sixcases;

public class Test4 {

	public static void main(String[] args) {
		Hello4 hello4a = new Hello4();
		Hello4 hello4b = new Hello4();

		Thread4A thread4a = new Thread4A(hello4a);
		Thread4A thread4b = new Thread4A(hello4b);
		thread4a.start();
		thread4b.start();
	}

}

class Thread4A extends Thread {
	Hello4 h1;

	public Thread4A(Hello4 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class Thread4B extends Thread {
	Hello4 h1;

	public Thread4B(Hello4 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m2();
	}
}

class Hello4 {
	public synchronized void m1() {
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