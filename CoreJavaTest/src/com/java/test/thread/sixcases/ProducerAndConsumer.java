package com.java.test.thread.sixcases;

public class ProducerAndConsumer {
	public static void main(String[] args) {
		Product product = new Product();
		Producer producer = new Producer(product);
		Consumer consumer = new Consumer(product);

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();

	}
}

class Producer implements Runnable {
	Product product;

	public Producer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		int a = 1;
		for (int i = 0; i < 6; i++) {
			product.push(a++);
		}

	}

}

class Consumer implements Runnable {
	Product product;

	public Consumer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(product.pop());
		}

	}

}

class Product {
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
		System.out.println("x is pushed: " + x);
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
		System.err.println("x is popped:  " + x);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		flag = false;
		notify();
		return x;
	}

}
