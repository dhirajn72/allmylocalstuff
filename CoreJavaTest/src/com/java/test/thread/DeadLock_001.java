package com.java.test.thread;

public class DeadLock_001 {

	public static Object ob1 = new Object();
	public static Object ob2 = new Object();

	public static void main(String[] args) {

		System.out.println("main starts");
		Thread t1 = new Thread(new Thread_001());
		Thread t2 = new Thread(new Thread_002());
		t1.start();
		t2.start();

		System.out.println("main ends");

	}

	static class Thread_001 extends Thread {
		@Override
		public void run() {
			synchronized (ob1) {
				System.out.println("Locked ob1, waiting for ob2");
				synchronized (ob2) {
					System.out.println("Locked ob2");
				}
			}
		}
	}

	static class Thread_002 extends Thread {
		@Override
		public void run() {
			synchronized (ob2) {
				System.out.println("Locked ob2, waiting for ob1");
				synchronized (ob1) {
					System.out.println("Locked ob1");
				}
			}
		}
	}

}
