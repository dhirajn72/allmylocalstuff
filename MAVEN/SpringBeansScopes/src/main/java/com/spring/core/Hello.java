package com.spring.core;

public class Hello {
	int a;
	String msg;

	public void setA(int a) {
		this.a = a;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", msg=" + msg + "]";
	}

}
