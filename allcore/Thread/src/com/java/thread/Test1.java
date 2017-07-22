package com.java.thread;

import java.util.Scanner;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer value:");

		int x = scanner.nextInt();
		Odd odd = new Odd(evenOdd, "Odd", x);
		Even even = new Even(evenOdd, "Even", x);
		System.out.println("main() ends");

	}
}

class Even implements Runnable {

	EvenOdd evenOdd;
	int y;

	public Even(EvenOdd evenOdd, String tname, int y) {
		this.evenOdd = evenOdd;
		this.y = y;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i <= y; i++) {
			evenOdd.even(x++);
		}

	}
}

class Odd implements Runnable {
	EvenOdd evenOdd;
	int y;

	public Odd(EvenOdd evenOdd, String tname, int y) {
		this.evenOdd = evenOdd;
		this.y = y;
		Thread thread = new Thread(this, tname);
		thread.start();
	}

	@Override
	public void run() {
		int x = 0;
		for (int i = 0; i <= y; i++) {
			evenOdd.odd(x++);
		}

	}
}

class EvenOdd {
	int x;
	boolean flag = false;

	public synchronized void even(int even) {

		if (flag) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		if ((even == 0) || (even % 2 == 0)) {
			System.out.println(Thread.currentThread().getName() + "->" + even);
		}

		flag = true;
		notify();

	}

	public synchronized void odd(int odd) {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if ((odd % 2) != 0) {
			System.out.println(Thread.currentThread().getName() + "->" + odd);
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
