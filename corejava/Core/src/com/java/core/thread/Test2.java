package com.java.core.thread;

public class Test2 {
	public static void main(String[] args) {
		Hello hello = new Hello();
		Hello hello2 = new Hello();
		MyThread myThread1 = new MyThread(hello);
		 MyThread myThread2 = new MyThread(hello2);
		myThread1.start();
		myThread2.start();

	}

}

class MyThread extends Thread {
	Hello h;

	public MyThread() {

	}

	public MyThread(Hello h) {
		this.h = h;

	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello {

	public synchronized void show() {
		Thread thread = Thread.currentThread();
		ThreadGroup threadGroup = thread.getThreadGroup();
		for (int i = 0; i < 5; i++) {
			System.out.println(thread.getName() + "->" + threadGroup.getName());
		}
		try {
			Thread.sleep(50);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
