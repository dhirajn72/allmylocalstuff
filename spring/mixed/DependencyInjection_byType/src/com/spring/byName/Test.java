package com.spring.byName;

public class Test {

	Hello hello;
	Hai hai;

	public void setHello(Hello hello) {
		this.hello = hello;
	}

	public void setHai(Hai hai) {
		this.hai = hai;
	}

	public void show() {
		System.out.println(hello);
		System.out.println(hai);

	}

}
