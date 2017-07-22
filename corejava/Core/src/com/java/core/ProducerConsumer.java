package com.java.core;

public class ProducerConsumer {

	public static void main(String[] args) {

		Stack stack = new Stack();
		Thread1 thread1 = new Thread1(stack, "Thread-A");
		Thread2 thread2 = new Thread2(stack, "Thread-B");

	}

}

class Thread1 implements Runnable {
	Stack stack;

	public Thread1(Stack stack, String name) {
		this.stack = stack;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {
		int x = 1;
		for (int i = 0; i < 10; i++) {
			stack.push(x++);
		}
	}
}

class Thread2 implements Runnable {
	Stack stack;

	public Thread2(Stack stack, String name) {
		this.stack = stack;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
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
		System.out.println("x is pushed:" + x);
		flag = true;
		notify();
	}

	public synchronized int pop() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("x is popped:" + x);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		flag = false;
		notify();
		return x;
	}

}
