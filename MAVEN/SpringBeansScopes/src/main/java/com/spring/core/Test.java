package com.spring.core;

public class Test {
	Hello hello;
	Hai hai;

	public Test(Hello hello) {
		super();
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
