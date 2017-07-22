package com.thread.six.cases;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("main() starts");
		Hello_2 hello_1 = new Hello_2();
		Thread_A2 a1 = new Thread_A2(hello_1, "A");
		Thread_B2 b1 = new Thread_B2(hello_1, "B");
		System.out.println("main() ends");

	}
}

class Thread_A2 implements Runnable {
	Hello_2 hello_1;

	public Thread_A2(Hello_2 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method1();
	}

}

class Thread_B2 implements Runnable {
	Hello_2 hello_1;

	public Thread_B2(Hello_2 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method2();
	}
}

class Hello_2 {

	public void method1() {
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
