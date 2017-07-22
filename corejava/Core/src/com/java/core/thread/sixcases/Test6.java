package com.java.core.thread.sixcases;

public class Test6 {

	public static void main(String[] args) {
		Hello6 hello6 = new Hello6();
		Hello6 hello62=new Hello6();
		Thread6A thread6a = new Thread6A(hello6);
		Thread6B thread6b = new Thread6B(hello62);
		thread6a.start();
		thread6b.start();

	}

}

class Thread6A extends Thread {
	Hello6 h1;

	public Thread6A(Hello6 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m1();
	}
}

class Thread6B extends Thread {
	Hello6 h1;

	public Thread6B(Hello6 h1) {
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.m2();
	}
}

class Hello6 {
	public static synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}

	}

	public static synchronized void m2() {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}
	}
}