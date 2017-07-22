/**
 * 
 */
package com.java.thread;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test4 {

	public static void main(String[] args) {

		System.out.println("main thread starts");
		Thread1A thread1a = new Thread1A();
		Thread1B thread1b = new Thread1B();
		Thread t1 = new Thread(thread1a, "Thread-A");
		t1.start();
		Thread t2 = new Thread(thread1b, "Thread-B");
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main thread ends");
	}
}

class Thread1A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		/*try {
			Thread.sleep(400);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}

}

class Thread1B implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
