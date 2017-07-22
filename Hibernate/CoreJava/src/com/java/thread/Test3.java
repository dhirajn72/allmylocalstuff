package com.java.thread;

public class Test3 {
	public static void main(String[] args) {
		ThreadTestA threadTest = new ThreadTestA();
		Thread1A thread1 = new Thread1A(threadTest);
		Thread2B thread2 = new Thread2B(threadTest);

	}
}

class Thread1A implements Runnable {
	ThreadTestA threadTest;

	public Thread1A(ThreadTestA threadTest) {
		this.threadTest = threadTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		threadTest.method1();

	}
}

class Thread2B implements Runnable {
	ThreadTestA threadTest;

	public Thread2B(ThreadTestA threadTest) {
		this.threadTest = threadTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		threadTest.method2();
	}
}

class ThreadTestA {

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
				System.out.println("method2 aquired object-2");

			}
		}
	}

}
