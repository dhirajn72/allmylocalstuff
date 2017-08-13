package com.test.java;

/**
 * @author dhiraj
 *
 */
public class ProducerConsumer {

	private boolean flag = false;
	private int data;

	/**
	 * @param data
	 */
	public synchronized void produce(int data) {

		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("Produced: " + this.data);
		flag = true;
		notify();

	}

	/**
	 * @return
	 */
	public synchronized int consume() {

		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int val = this.data;
		System.out.println("Consumed: " + this.data);
		try {
			Thread.sleep(600);
		} catch (Exception e) {
			e.printStackTrace();
		}
		flag = false;
		notify();

		return val;
	}
}
