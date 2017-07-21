package com.java.thread;

public class Test {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();

	}

	public static class Thread1 extends Thread {

		@Override
		public void run() {
			synchronized (String.class) {
				System.out.println("Thread1 aquired Object-1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (Integer.class) {
					System.out.println("Thread1 aquired Object-2");

				}
			}
		}
	}

	public static class Thread2 extends Thread {
		@Override
		public void run() {
			synchronized (Integer.class) {
				System.out.println("Thread2 aquired Object-1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (String.class) {
					System.out.println("Thread2 aquired Object-2");

				}

			}
		}
	}

}
