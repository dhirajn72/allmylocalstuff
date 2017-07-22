package com.java.core.thread;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("main starts");
		MyThread3 myThread3 = new MyThread3();
		MyThread4 myThread4 = new MyThread4();

		try {
			myThread3.join();
			//myThread4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main ends");

	}
}

class MyThread3 extends Thread {
	public MyThread3() {
		this.start();
	}

	@Override
	public void run() {
		System.out.println("MyThread3-run()");
		try {
			//this.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyThread4 extends Thread {
	public MyThread4() {
		this.start();
	}

	@Override
	public void run() {
		System.out.println("MyThread4-run()");
	}
}