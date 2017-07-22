package com.spring.byName;

public class Hai {
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
		return a + " " + msg;
	}

}
