package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {

	@Autowired
	@Qualifier("hello1")
	Hello hello;
	Hai hai;

	public void setHello(Hello hello) {
		this.hello = hello;
	}

	public Test(Hai hai) {
		super();
		this.hai = hai;
	}

	public void show() {
		System.out.println(hello);
		System.out.println(hai);

	}

}
