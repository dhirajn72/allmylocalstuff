package com.thread.six.cases;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("main() starts");
		Hello_4 hello_1 = new Hello_4();
		Hello_4 hello_2 = new Hello_4();

		Thread_A4 a1 = new Thread_A4(hello_1, "A");
		Thread_B4 b1 = new Thread_B4(hello_2, "B");
		System.out.println("main() ends");

	}
}

class Thread_A4 implements Runnable {
	Hello_4 hello_1;

	public Thread_A4(Hello_4 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method1();
	}

}

class Thread_B4 implements Runnable {
	Hello_4 hello_1;

	public Thread_B4(Hello_4 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method2();
	}
}

class Hello_4 {

	public synchronized void method1() {
		System.out.println("method1()");
		Thread t = Thread.currentThread();

		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " " + t.getId());
		}
	}

	public synchronized void method2() {
		System.out.println("method2()");
		Thread t = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " " + t.getId());
		}
	}

}
