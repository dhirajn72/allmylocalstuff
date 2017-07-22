package com.java.core.thread;

public class Dead {

	public static Object object1 = new Object();
	public static Object object2 = new Object();

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();

	}

	public static class Thread1 extends Thread {
		@Override
		public void run() {

			synchronized (object1) {
				System.out.println("Got object-1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object2) {
					System.out.println("object-2");
				}
			}

		}
	}

	public static class Thread2 extends Thread {
		@Override
		public void run() {

			synchronized (object2) {
				System.out.println("Got object-2");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (object1) {
					System.out.println("object-1");
				}
			}
		}
	}

}
