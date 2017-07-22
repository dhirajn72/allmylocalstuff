package com.spring.byName;

public class Test {

	Hello hello;
	Hai hai;



	public Test(Hello hello, Hai hai) {
		super();
		this.hello = hello;
		this.hai = hai;
	}



	public void show() {
		System.out.println(hello);
		System.out.println(hai);

	}

}
