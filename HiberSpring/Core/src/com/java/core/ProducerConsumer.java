package com.java.core;

public class ProducerConsumer {
	public static void main(String[] args) {
		ProducerConsumerTest producerConsumerTest = new ProducerConsumerTest();
		Producer producer = new Producer(producerConsumerTest);
		Consumer consumer = new Consumer(producerConsumerTest);

	}
}

class Producer implements Runnable {

	ProducerConsumerTest producerConsumerTest;

	public Producer(ProducerConsumerTest producerConsumerTest) {
		this.producerConsumerTest = producerConsumerTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		int x = 1;
		for (int i = 1; i < 10; i++) {
			producerConsumerTest.produce(x++);
		}
	}
}

class Consumer implements Runnable {
	ProducerConsumerTest producerConsumerTest;

	public Consumer(ProducerConsumerTest producerConsumerTest) {
		this.producerConsumerTest = producerConsumerTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			int x = producerConsumerTest.consume();
			// System.out.println(x);
		}
	}
}

class ProducerConsumerTest {

	int x;
	boolean flag = false;

	public synchronized void produce(int x) {
		if (flag) {
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
		this.x = x;
		System.out.println(x + " Produced");
		flag = true;
		notify();

	}

	public synchronized int consume() {

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
		System.out.println(x + " Consumed");
		flag = false;
		notify();
		return x;
	}

}
