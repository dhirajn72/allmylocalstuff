package com.java.core.thread;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Testing t = new Testing();
		ThreadTest threadTest = new ThreadTest(t);
		Thread a = new Thread(threadTest, "A");
		Thread b = new Thread(threadTest, "B");
		Thread c = new Thread(threadTest, "C");
		a.start();
		b.start();
		c.start();

		try {
			a.join();
			b.join();
			c.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main ends");

	}
}

class ThreadTest implements Runnable {
	Testing t;

	public ThreadTest(Testing t) {
		this.t = t;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			t.method1();

		}
		System.out.println("thread:" + Thread.currentThread().getName());

	}

}

class Testing {
	public synchronized void method1() {
		Thread t = Thread.currentThread();
		try {
			Thread.sleep(100);
			// wait(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(t.getName());
	}
}
