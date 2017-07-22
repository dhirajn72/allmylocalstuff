package com.java.core.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test16 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();

		ExecutorService service = Executors.newFixedThreadPool(10);
		service.execute(myThread);

		service.shutdown();
		
		Executor executor=new Executor() {
			
			public void execute(Runnable command) {
				// TODO Auto-generated method stub
				
			}
		};

	}
}

class MyThread extends Thread {
	@Override
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
