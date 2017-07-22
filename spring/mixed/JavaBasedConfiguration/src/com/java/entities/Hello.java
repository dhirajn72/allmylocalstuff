package com.java.entities;

public class Hello {
	private int a;
	private String msg;

	public Hello() {
		System.out.println("Hello-DC");
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void show() {
		System.out.println("Hello-show()");
		System.out.println(a + " " + msg);
	}

}
