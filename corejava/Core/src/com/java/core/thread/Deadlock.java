package com.java.core.thread;

public class Deadlock {

	public static Object object1 = new Object();
	public static Object object2 = new Object();

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
	}

	static class Thread1 extends Thread {
		@Override
		public void run() {

			synchronized (object1) {
				System.out.println("Thread1-got thread-1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object2) {
					System.out.println("Thread1-got thread-2");

				}
			}
		}
	}

	static class Thread2 extends Thread {
		@Override
		public void run() {
			synchronized (object2) {
				System.out.println("Thread2-got thread-2");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object1) {
					System.out.println("Thread2-got thread-1");
				}
			}

		}
	}

}
