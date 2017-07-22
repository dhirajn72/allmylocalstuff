package com.java.core;

public class Test10 {

	static Object object1 = new Object();
	static Object object2 = new Object();

	public static void main(String[] args) {
		System.out.println("main() starts");
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();

		System.out.println("main() ends");

	}

	static class Thread1 implements Runnable {

		@Override
		public void run() {
			synchronized (object1) {
				System.out.println("Thread-1 locked object1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object2) {
					System.out.println("Thread-1 locked object2");
				}
			}

		}
	}

	static class Thread2 implements Runnable {

		@Override
		public void run() {

			synchronized (object2) {
				System.out.println("Thread-2 locked object2");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object1) {
					System.out.println("Thread-2 locked object1");
				}
			}
		}
	}

}
