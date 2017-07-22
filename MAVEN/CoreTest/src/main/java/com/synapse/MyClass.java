package com.synapse;

public class MyClass {

	public static void main(String[] args) {
		Calculate c = new Calculate();
		Thread t1 = new Thread(new MyThread(1, c));
		Thread t2 = new Thread(new MyThread(2, c));
		t2.start();
		t1.start();

	}
}

class MyThread implements Runnable {
	int tId;
	Calculate c;
	public static int res;

	MyThread(int tId, Calculate c) {
		this.tId = tId;
		this.c = c;

	}

	public void run() {
		c.m(tId);
	}

}

class Calculate {
	int res;

	public synchronized void m(int tId) {
		if (tId == 1) {
			try {
				res = m1(5);
				// Thread.sleep(6000);
				System.out.println("Output of Thread1 : " + res);
				notifyAll();
				wait();
				System.out.println("Input to Thread1 from Thread2 : " + res);
				res = m1(res);
				System.out.println("Second Output of Thread1 : " + res);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
			}
		} else {
			try {
				System.out.println("Input to Thread2 : " + res);
				wait();
				res = m1(res);
				System.out.println("Output of Thread2 : " + res);
				Thread.sleep(1000);
				notifyAll();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
			}
		}
	}

	public synchronized void n()

	{

	}

	public int m1(int input) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		return (input + 5);
	}
}