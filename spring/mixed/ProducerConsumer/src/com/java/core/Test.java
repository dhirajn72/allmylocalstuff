package com.java.core;

public class Test {
	public static void main(String[] args) {
		Stack stack1 = new Stack();

		Producer thread1 = new Producer(stack1, "Producer");
		Consumer thread2 = new Consumer(stack1, "Consumer");

	}
}

class Producer implements Runnable {

	Stack stack;

	public Producer(Stack stack, String name) {
		this.stack = stack;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i < 5; i++) {
			stack.push(x++);
		}

	}
}

class Consumer implements Runnable {

	Stack stack;

	public Consumer(Stack stack, String name) {
		this.stack = stack;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}

	}

}

class Stack {

	int x;
	boolean flag = false;

	public synchronized void push(int x) {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.x = x;
		System.out.println("X is produced:" + x);
		flag = true;
		notify();

	}

	public synchronized int pop() {

		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("x is consumed:" + x);
		flag = false;
		notify();
		return x;
	}

}
