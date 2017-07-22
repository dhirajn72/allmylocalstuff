package com.thread.six.cases;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("main() starts");
		Hello_6 hello_1 = new Hello_6();
		Thread_A6 a1 = new Thread_A6(hello_1, "A");
		Thread_B6 b1 = new Thread_B6(hello_1, "B");
		System.out.println("main() ends");

	}
}

class Thread_A6 implements Runnable {
	Hello_6 hello_1;

	public Thread_A6(Hello_6 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method1();
	}

}

class Thread_B6 implements Runnable {
	Hello_6 hello_1;

	public Thread_B6(Hello_6 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method2();
	}
}

class Hello_6 {

	public static synchronized void method1() {
		System.out.println("method1()");
		Thread t = Thread.currentThread();

		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " " + t.getId());
		}
	}

	public static synchronized void method2() {
		System.out.println("method2()");
		Thread t = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " " + t.getId());
		}
	}

}
