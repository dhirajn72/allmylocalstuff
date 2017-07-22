package com.java.core.thread;

public class Test3 {
	public static void main(String[] args) {

		Thread1 thread1 = new Thread1();
		Thread thread = new Thread(thread1);
		thread.start();
		String name = Thread.currentThread().getName();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}

	}
}

class Thread1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(i + "->" + name);
		}
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
