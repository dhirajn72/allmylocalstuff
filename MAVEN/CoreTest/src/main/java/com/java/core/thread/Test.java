package com.java.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		TestA testA = new TestA();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			executorService.execute(testA);
		}

	}
}

class TestA implements Runnable {

	public void run() {
		Thread thread = Thread.currentThread();

		for (int i = 0; i < 10; i++) {
			System.out.println(thread.getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println(thread.getName() + " task completed");

	}

}
