package com.java.core.thread;

public class Test1 {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("A");
		MyThread myThread2 = new MyThread("B");
		MyThread myThread3 = new MyThread("C");
		MyThread myThread4 = new MyThread("D");
		MyThread myThread5 = new MyThread("E");

	}

}

class MyThread extends Thread implements Runnable {
	public MyThread(String tname) {
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getId() + " " + thread.getName() + " "
					+ i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
