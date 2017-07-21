package com.java.core.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

	public static void main(String[] args) {
		Testing testing = new Testing();
		ThreadTest command = new ThreadTest(testing);
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.execute(command);
		/*ExecutorService service2 = Executors.newFixedThreadPool(10);
		service2.execute(command);
		service2.shutdown();*/

	}

}

class ThreadTest implements Runnable {
	Testing testing;

	public ThreadTest(Testing testing) {
		this.testing = testing;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				testing.method1();
				System.out.println(Thread.currentThread().getName() + " "
						+ Thread.currentThread().getThreadGroup());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

class Testing {
	public synchronized void method1() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
			wait(200);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
