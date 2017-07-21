package com.java.core;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {

		/*
		 * System.out.println("main starts"); ExecutorService executorService =
		 * Executors.newFixedThreadPool(10);
		 * 
		 * executorService.execute(new Thread1(new HelloTest()));
		 * System.out.println("main ends");
		 */

		HelloTest helloTest = new HelloTest();
		Thread1 thread1 = new Thread1(helloTest);

	}
}

class Thread1 implements Runnable {
	HelloTest helloTest;

	public Thread1(HelloTest helloTest) {
		this.helloTest = helloTest;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		helloTest.show();
	}
}

class HelloTest {

	public void show() {

		List<Integer> integers = new LinkedList<Integer>();
		String exp = "^[0-9]*";
		try {
Scanner scanner = new Scanner(new File("/home/dhiraj/data.txt"));
			//Scanner scanner = new Scanner(new File("src/data.txt"));
			while (scanner.hasNext()) {
				String val = scanner.next();
				//System.out.println(val);
				if (val.matches(exp)) {
					integers.add(Integer.parseInt(val));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Integers are:");
		for (Integer ele : integers) {
			System.out.println(ele);
		}

	}

}
