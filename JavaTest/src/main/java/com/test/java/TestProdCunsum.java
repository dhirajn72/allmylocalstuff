package com.test.java;

public class TestProdCunsum {
	public static void main(String[] args) {

		System.out.println("main starts !!");
		ProducerConsumer producerConsumer = new ProducerConsumer();
		ThreadA threadA = new ThreadA(producerConsumer);
		ThreadB threadB = new ThreadB(producerConsumer);
		System.out.println("main ends !!");

	}

}

class ThreadA implements Runnable {
	private ProducerConsumer producerConsumer;

	public ThreadA(ProducerConsumer producerConsumer) {
		this.producerConsumer = producerConsumer;
		new Thread(this).start();
	}

	public void run() {
		int data = 0;
		for (int i = 0; i < 10; i++) {
			producerConsumer.produce(data++);
		}
	}
}

class ThreadB implements Runnable {
	private ProducerConsumer producerConsumer;

	public ThreadB(ProducerConsumer producerConsumer) {
		this.producerConsumer = producerConsumer;
		new Thread(this).start();

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			// System.out.println(producerConsumer.consume());
			producerConsumer.consume();
		}
	}
}
