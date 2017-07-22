/**
 * 
 */
package com.java.thread;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class DeadLock {

	public static Object OBJECT1 = new Object();
	public static Object OBJECT2 = new Object();

	public static void main(String[] args) {
		Thread6A thread6a = new Thread6A();
		Thread6B thread6b = new Thread6B();
		thread6a.start();
		thread6b.start();

	}

	static class Thread6A extends Thread {

		@Override
		public void run() {
			synchronized (OBJECT1) {
				System.out.println("Thread-1 Aquired OBJECT1");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (OBJECT2) {
					System.out.println("Thread-1 Aquired OBJECT2");
				}
			}
		}
	}

	static class Thread6B extends Thread {

		@Override
		public void run() {
			synchronized (OBJECT2) {
				System.out.println("Thread-2 Aquired OBJECT2");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (OBJECT1) {
					System.out.println("Thread-2 Aquired OBJECT1");

				}
			}
		}
	}

}
