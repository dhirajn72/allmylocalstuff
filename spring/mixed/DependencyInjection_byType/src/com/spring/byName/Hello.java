package com.spring.byName;

public class Hello {
	int a;
	String msg;

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
