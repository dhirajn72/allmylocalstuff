package com.java.entities;

public class Hai {

	private int a;
	private String msg;

	public Hai(int a, String msg) {
		super();
		this.a = a;
		this.msg = msg;
	}

	public void show() {
		System.out.println("Hai-show()");
		System.out.println(a + " " + msg);
	}

}
