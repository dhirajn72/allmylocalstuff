package com.thread.six.cases;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("main() starts");
		Hello_5 hello_1 = new Hello_5();
		Thread_A5 a1 = new Thread_A5(hello_1, "A");
		Thread_B5 b1 = new Thread_B5(hello_1, "B");
		System.out.println("main() ends");

	}
}

class Thread_A5 implements Runnable {
	Hello_5 hello_1;

	public Thread_A5(Hello_5 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method1();
	}

}

class Thread_B5 implements Runnable {
	Hello_5 hello_1;

	public Thread_B5(Hello_5 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method2();
	}
}

class Hello_5 {

	public static synchronized void method1() {
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
