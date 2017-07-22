package com.spring.annotations;

public class Hai {
	int a;
	String msg;

	public Hai(int a, String msg) {
		super();
		this.a = a;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return this.a + " " + this.msg;
	}
}
