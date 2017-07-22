package com.java.sixcases;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Case1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// System.out.println("main starts");
		Hello1 hello1 = new Hello1();
		A1 a1 = new A1(hello1, "Thread-A");
		B1 b1 = new B1(hello1, "Thread-B");
		// System.out.println("main ends");

	}

}

class A1 implements Runnable {
	Hello1 hello1;

	public A1(Hello1 hello1, String tname) {
		this.hello1 = hello1;
		Thread thread = new Thread(this, tname);
		thread.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			hello1.m1();
		}
	}
}

class B1 implements Runnable {
	Hello1 hello1;

	public B1(Hello1 hello1, String tname) {
		this.hello1 = hello1;
		Thread thread = new Thread(this, tname);
		thread.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			hello1.m2();
		}
	}
}

class Hello1 {
	public synchronized void m1() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());

	}

	public synchronized void m2() {
		System.out.println(Thread.currentThread().getName());

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
