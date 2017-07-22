package com.java.core;

public class CopyOfTest10 {

	public static void main(String[] args) {
		System.out.println("main starts");
		CalculateA calculatea = new CalculateA();

		Thread1A thread1a = new Thread1A(calculatea);
		Thread1A thread1b = new Thread1A(calculatea);

		System.out.println("main ends");
	}
}

class Thread1A implements Runnable {
	CalculateA calculate;;
	static int v;

	public Thread1A(CalculateA calculate) {
		this.calculate = calculate;
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		System.out
				.println("Thread 1 is performing calculations with value =20 ");
		int v1 = calculate.getValue(20);
		System.out.println("The final value recieved by  Thread 1: " + v1);
		Thread1A.v = v1;

	}
}

class CalculateA {

	static int x;
	boolean flag = false;

	public synchronized int getValue(int value) {

		// System.out.println(flag);

		if (!flag) {
			this.x = value + 50;
			System.out.println("performed by Thread 1: " + x);
			try {
				flag = true;
				System.out.println("Thread1 going to wait state");
				wait(500);
				System.out.println("Thread 1 woke up from wait state");

				return x;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Thread 2 is performing subtraction 30 from: " + x);
		x = x - 30;
		notify();
		return x;
	}

}