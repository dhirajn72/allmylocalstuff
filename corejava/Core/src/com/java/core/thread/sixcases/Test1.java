package com.java.core.thread.sixcases;

public class Test1 {

	public static void main(String[] args) {
		Hello1 hello1 = new Hello1();
		// Hello1 hello2 = new Hello1();

		Thread1A thread1a = new Thread1A(hello1);
		Thread1B thread1b = new Thread1B(hello1);

		thread1a.start();
		thread1b.start();

	}

}

class Thread1A extends Thread {
	Hello1 h1;

	public Thread1A(Hello1 h1) {
		this.h1 = h1;

	}

	@Override
	public void run() {
		h1.m1();

	}
}

class Thread1B extends Thread {
	Hello1 h1;

	public Thread1B(Hello1 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m2();
	}
}

class Hello1 {
	public synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
		/*	try {
				wait(400);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}

	}

	public synchronized void m2() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			/*try {
				wait(400);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}
	}
}