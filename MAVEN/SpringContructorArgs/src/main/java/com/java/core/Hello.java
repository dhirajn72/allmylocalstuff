package com.java.core;

public class Hello {
	private int a;
	private String msg;

	public Hello(int a, String msg) {
		super();
		this.a = a;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return a + " " + msg;
	}

}
