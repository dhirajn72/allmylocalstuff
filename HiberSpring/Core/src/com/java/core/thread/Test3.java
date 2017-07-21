package com.java.core.thread;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Thread t = Thread.currentThread();
		ThreadTest1 threadTest1 = new ThreadTest1(t);
		Thread thread = new Thread(threadTest1, "A");
		thread.start();
		try {
			Thread.currentThread().sleep(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}

class ThreadTest1 implements Runnable {
	Thread t;

	public ThreadTest1(Thread t) {
		this.t = t;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				if (i == 5) {
					System.out.print(i + "->");
					t.join();
				}
				Thread.sleep(500);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
