package com.thread.six.cases;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("main() starts");
		Hello_3 hello_1 = new Hello_3();
		Thread_A3 a1 = new Thread_A3(hello_1, "A");
		Thread_B3 b1 = new Thread_B3(hello_1, "B");
		System.out.println("main() ends");

	}
}

class Thread_A3 implements Runnable {
	Hello_3 hello_1;

	public Thread_A3(Hello_3 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method1();
	}

}

class Thread_B3 implements Runnable {
	Hello_3 hello_1;

	public Thread_B3(Hello_3 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method2();
	}
}

class Hello_3 {

	public synchronized void method1() {
		System.out.println("method1()");
		Thread t = Thread.currentThread();

		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " " + t.getId());
		}
	}

	public void method2() {
		System.out.println("method2()");
		Thread t = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " " + t.getId());
		}
	}

}
