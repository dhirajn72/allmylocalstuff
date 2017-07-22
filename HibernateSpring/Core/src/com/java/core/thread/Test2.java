package com.java.core.thread;

public class Test2 {
	public static void main(String[] args) {
		DeadLockTest deadLockTest = new DeadLockTest();
		ThreadA a = new ThreadA(deadLockTest);
		ThreadB b = new ThreadB(deadLockTest);
	}
}

class ThreadA implements Runnable {

	DeadLockTest deadLockTest;

	public ThreadA(DeadLockTest deadLockTest) {
		this.deadLockTest = deadLockTest;
		Thread thread = new Thread(this, "A");
		thread.start();
	}

	@Override
	public void run() {
		deadLockTest.method1();

	}
}

class ThreadB implements Runnable {
	DeadLockTest deadLockTest;

	public ThreadB(DeadLockTest deadLockTest) {
		this.deadLockTest = deadLockTest;
		Thread thread = new Thread(this, "B");
		thread.start();
	}

	@Override
	public void run() {
		deadLockTest.method2();
	}
}

class DeadLockTest {

	public void method1() {
		synchronized (String.class) {
			System.out.println("String class locked");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Integer.class) {
				System.out.println("Integer- This class won't be locked");

			}

		}

	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Integer class locked");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("String- This class won't be locked");

			}

		}
	}

}