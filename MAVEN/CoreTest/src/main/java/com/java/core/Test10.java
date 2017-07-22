package com.java.core;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Calculate calculate = new Calculate();

		Thread1 thread1 = new Thread1(calculate);
		Thread2 thread2 = new Thread2(calculate);
		System.out.println("main ends");
	}
}

class Thread1 implements Runnable {
	Calculate calculate;;
	static int v;

	public Thread1(Calculate calculate) {
		this.calculate = calculate;
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		System.out
				.println("Thread 1 is performing calculations with value =20 ");
		int v1 = calculate.getValue(20);
		System.out.println("The final value recieved by  Thread 1: " + v1);
		Thread1.v = v1;

	}
}

class Thread2 implements Runnable {
	Calculate calculate;

	public Thread2(Calculate calculate) {
		this.calculate = calculate;
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		int z = Calculate.x;
		System.out.println("value got from Thread 1 is: " + z
				+ " and passing to Thread 2");
		int v = calculate.getValue(z);
		System.out.println("The final value coming from  Thread 2: " + v);
	}
}

class Calculate {

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