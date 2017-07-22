/**
 * 
 */
package com.java.thread;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class DeadlockUsingMethod {

	public static void main(String[] args) {
		// System.out.println("main starts");
		ThreadTest threadTest = new ThreadTest();
		Thread5A thread5a = new Thread5A(threadTest, "Thread-A");
		Thread5B thread5b = new Thread5B(threadTest, "Thread-B");
		// System.out.println("main ends");
	}

}

class Thread5A implements Runnable {
	ThreadTest threadTest;

	public Thread5A(ThreadTest threadTest, String tname) {
		this.threadTest = threadTest;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		threadTest.method1();

	}
}

class Thread5B implements Runnable {
	ThreadTest threadTest;

	public Thread5B(ThreadTest threadTest, String tname) {
		this.threadTest = threadTest;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		threadTest.method2();

	}
}

class ThreadTest {
	public void method1() {
		synchronized (String.class) {
			System.out.println("method1()-Aquired lock on String.class object"
					+ "->" + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Integer.class) {
				System.out
						.println("method1()-Aquired lock on Integer.class object");
			}
		}
	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("method2()-Aquired lock on Integer.class object"
					+ "->" + Thread.currentThread().getName());

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out
						.println("method2()-Aquired lock on String.class object"
								+ "->" + Thread.currentThread().getName());
			}
		}
	}

}