package com.java.core;

public class Test11 {
	public static void main(String[] args) {
		DeadlockTest deadlockTest = new DeadlockTest();
		Thread_A a = new Thread_A(deadlockTest);
		Thread_B b = new Thread_B(deadlockTest);

	}
}

class Thread_A implements Runnable {
	DeadlockTest deadlockTest;

	public Thread_A(DeadlockTest deadlockTest) {
		this.deadlockTest = deadlockTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		deadlockTest.method1();
	}
}

class Thread_B implements Runnable {
	DeadlockTest deadlockTest;

	public Thread_B(DeadlockTest deadlockTest) {
		this.deadlockTest = deadlockTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		deadlockTest.method2();
	}
}

class DeadlockTest {

	public void method1() {

		synchronized (String.class) {
			System.out.println("String object locked-method1");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Integer.class) {
				System.out.println("Integer object locked-method1");
			}
		}
	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Integer object locked-method2");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("String object locked-method2");
			}
		}
	}

}
