package com.java.core.thread.sixcases;

public class ProducerAndConsumer {
	public static void main(String[] args) {

		Stack stack = new Stack();

		B b = new B(stack, "Thread->B");
		A a = new A(stack, "Thread->A");

	}
}

class A implements Runnable {
	Stack stack;

	public A(Stack stack, String name) {
		this.stack = stack;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {
		int a = 1;
		for (int i = 0; i < 7; i++) {
			stack.push(a++);
		}

	}
}

class B implements Runnable {
	Stack stack;

	public B(Stack stack, String name) {
		this.stack = stack;
		Thread thread = new Thread(this, name);
		thread.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
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
				e.printStackTrace();
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
