package com.thread.six.cases;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main() starts");
		Hello_1 hello_1 = new Hello_1();
		Thread_A1 a1 = new Thread_A1(hello_1, "A");
		Thread_B1 b1 = new Thread_B1(hello_1, "B");
		System.out.println("main() ends");

	}
}

class Thread_A1 implements Runnable {
	Hello_1 hello_1;

	public Thread_A1(Hello_1 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method1();
	}

}

class Thread_B1 implements Runnable {
	Hello_1 hello_1;

	public Thread_B1(Hello_1 hello_1, String name) {
		this.hello_1 = hello_1;
		Thread thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		hello_1.method2();
	}
}

class Hello_1 {

	public synchronized void method1() {
		System.out.println("method1()");
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
	}

	public synchronized void method2() {
		System.out.println("method2()");
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());

	}

}
