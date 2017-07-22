package com.java.core.thread;

public class Test {

	static Object object1 = new Object();
	static Object object2 = new Object();

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();

	}

	static class Thread1 implements Runnable {
		@Override
		public void run() {
			synchronized (object1) {
				System.out.println("Object-1 locked");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object2) {
					System.out.println("Object-2 Will never be locked");
				}
			}

		}
	}

	static class Thread2 implements Runnable {
		@Override
		public void run() {
			synchronized (object2) {
				System.out.println("Object-2 locked");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object1) {
					System.out.println("Object-1 Will never be locked");
				}
			}

		}
	}

}
