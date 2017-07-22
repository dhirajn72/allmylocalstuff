package com.java.entities;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class HaiHello {

	@Inject
	private Hello hello;

	@Inject
	@Qualifier("hai2")
	private Hai hai;

	public void show() {
		System.out.println(hello);
		System.out.println(hai);
	}

}
