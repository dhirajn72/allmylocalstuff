package com.java.test.thread;

public class DeadLock1 {

	public static Object ob1 = new Object();
	public static Object ob2 = new Object();

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

	static class Thread1 extends Thread {

		@Override
		public void run() {
			synchronized (ob1) {
				System.out.println("Obtained lock on ob1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (ob2) {
					System.out.println("Waiting for lock on ob1");

				}

			}

		}
	}

	static class Thread2 extends Thread {

		@Override
		public void run() {
			synchronized (ob2) {
				System.out.println("Obtained lock on ob2");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (ob1) {
					System.out.println("Waiting for lock on ob1");
				}

			}

		}
	}

}
