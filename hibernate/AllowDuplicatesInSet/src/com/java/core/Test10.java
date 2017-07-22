package com.java.core;

public class Test10 {
	public static void main(String[] args) {
		ProducerConsumer producerConsumer = new ProducerConsumer();
		Consumer consumer = new Consumer(producerConsumer, "Consumer");
		Producer producer = new Producer(producerConsumer, "Producer");

	}
}

class Producer extends Thread {
	ProducerConsumer producerConsumer=null;

	public Producer(ProducerConsumer producerConsumer, String tname) {
		super(tname);
		this.producerConsumer = producerConsumer;
		start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			producerConsumer.push(x++);
		}
	}
}

class Consumer extends Thread {
	ProducerConsumer producerConsumer=null;

	public Consumer(ProducerConsumer producerConsumer, String tname) {
		super(tname);
		this.producerConsumer = producerConsumer;
		start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			producerConsumer.pop();
		}
	}
}

/*
class Producer implements Runnable{
	ProducerConsumer producerConsumer=null;

	public Producer(ProducerConsumer producerConsumer, String tname) {
		this.producerConsumer = producerConsumer;
		Thread thread=new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		int a = 1;
		for (int i = 0; i < 10; i++) {
			producerConsumer.push(a++);
		}
	}
}

class Consumer implements Runnable{
	ProducerConsumer producerConsumer=null;

	public Consumer(ProducerConsumer producerConsumer, String tname) {
				this.producerConsumer = producerConsumer;
		Thread thread=new Thread(this, tname);
				thread.start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			producerConsumer.pop();
		}
	}
}
*/

class ProducerConsumer {
	int x;
	boolean flag = false;

	
	
	public synchronized void push(int x) {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}}

			this.x = x;
			System.out.println("X is pushed" + x);
			flag = true;
			notify();

		

	}

	public synchronized int pop() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}}
			System.out.println("X is popped" + x);

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
