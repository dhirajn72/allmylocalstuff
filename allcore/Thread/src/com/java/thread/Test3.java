/**
 * 
 */
package com.java.thread;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintEvenOdd printEvenOdd = new PrintEvenOdd();
		Thread2 thread2 = new Thread2(printEvenOdd, "Odd");
		Thread1 thread1 = new Thread1(printEvenOdd, "Even");

		System.out.println("main thread ends");

	}

}

class Thread1 implements Runnable {
	PrintEvenOdd printEvenOdd;

	/**
	 * 
	 */
	public Thread1(PrintEvenOdd printEvenOdd, String tname) {
		// TODO Auto-generated constructor stub
		this.printEvenOdd = printEvenOdd;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		for (int i = 0; i <= 20; i++) {
			printEvenOdd.even(x++);
		}

	}
}

class Thread2 implements Runnable {
	PrintEvenOdd printEvenOdd;

	/**
	 * 
	 */
	public Thread2(PrintEvenOdd printEvenOdd, String tname) {
		// TODO Auto-generated constructor stub
		this.printEvenOdd = printEvenOdd;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		for (int i = 0; i <= 20; i++) {
			printEvenOdd.odd(x++);
		}

	}
}

class PrintEvenOdd {
	boolean flag = false;

	public synchronized void even(int x) {

		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (x % 2 == 0) {
			System.out.println(Thread.currentThread().getName() + "->" + x);
		}
		
		flag = true;
		notify();

	}

	public synchronized void odd(int x) {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (x % 2 != 0) {
			System.out.println(Thread.currentThread().getName() + "->" + x);
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		flag = false;
		notify();

	}
}
