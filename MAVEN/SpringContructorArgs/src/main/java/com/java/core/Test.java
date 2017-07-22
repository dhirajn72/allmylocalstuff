package com.java.core;

public class Test {
	private Hello hello;
	private Hai hai;

	public Test() {
		System.out.println("Test()");
	}

	public Test(Hello hello) {
		this.hello = hello;
		System.out.println("Test(Hello hello) ");
	}

	public Test(Hai hai) {
		super();
		this.hai = hai;
		System.out.println(" Test(Hai hai)");
	}

	public Test(Hello hello, Hai hai) {
		super();
		this.hello = hello;
		this.hai = hai;
		System.out.println("Test(Hello hello, Hai hai)");
	}

	public void show() {
		System.out.println(hello);
		System.out.println(hai);

	}

}
