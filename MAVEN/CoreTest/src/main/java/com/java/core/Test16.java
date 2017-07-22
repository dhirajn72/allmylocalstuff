package com.java.core;

import java.util.concurrent.Callable;

public class Test16 {
	public static void main(String[] args) {
		Thread_A thread_A = new Thread_A();

		// Thread thread=new Thread(thread_A);

	}
}

class Thread_A implements Callable {

	public Object call() throws Exception {
		for (int i = 0; i < 5; i++) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName() + " " + i);
			try {
				Thread.sleep(500);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
