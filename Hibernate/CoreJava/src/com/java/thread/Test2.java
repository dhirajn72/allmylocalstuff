package com.java.thread;

public class Test2 {
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		Thread1 thread1 = new Thread1(threadTest);
		Thread2 thread2 = new Thread2(threadTest);

	}
}

class Thread1 implements Runnable {
	ThreadTest threadTest;

	public Thread1(ThreadTest threadTest) {
		this.threadTest = threadTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		threadTest.method1();

	}
}

class Thread2 implements Runnable {
	ThreadTest threadTest;

	public Thread2(ThreadTest threadTest) {
		this.threadTest = threadTest;
		Thread thread = new Thread(this);
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
			System.out.println("method1 aquired object-1");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Integer.class) {
				System.out.println("method1 aquired object-2");

			}
		}

	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("method2 aquired object-1");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("method2 aquired object-1");

			}
		}
	}

}
