package com.java.core;

public class ThreadTest {
	public static void main(String[] args) {

		Stack1 stack1 = new Stack1();
		Customer5 customer5 = new Customer5(stack1, "Cust-5");
		Customer5 customer4 = new Customer5(stack1, "Cust-4");
		Customer5 customer3 = new Customer5(stack1, "Cust-3");
		Customer5 customer2 = new Customer5(stack1, "Cust-2");
		Customer5 customer1 = new Customer5(stack1, "Cust-1");
		Producer1 producer1 = new Producer1(stack1, "Prod");
		System.out.println("main ends");

	}

}

class Producer1 implements Runnable {
	Stack1 stack;

	public Producer1(Stack1 stack1, String tname) {
		this.stack = stack1;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i < 5; i++) {
			stack.push(++x);
		}
	}
}

class Customer1 implements Runnable {
	Stack1 stack;

	public Customer1(Stack1 stack1, String tname) {
		this.stack = stack1;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}
	}
}

class Customer2 implements Runnable {
	Stack1 stack;

	public Customer2(Stack1 stack1, String tname) {
		this.stack = stack1;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}
	}
}

class Customer3 implements Runnable {
	Stack1 stack;

	public Customer3(Stack1 stack1, String tname) {
		this.stack = stack1;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}
	}
}

class Customer4 implements Runnable {
	Stack1 stack;

	public Customer4(Stack1 stack1, String tname) {
		this.stack = stack1;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}
	}
}

class Customer5 implements Runnable {
	Stack1 stack;

	public Customer5(Stack1 stack1, String tname) {
		this.stack = stack1;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}
	}
}

class Stack1 {

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
		System.out.println("x is pushed:->" + x + ":"
				+ Thread.currentThread().getName());
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

		System.out.println("x is popped:->" + x + ":"
				+ Thread.currentThread().getName());
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
