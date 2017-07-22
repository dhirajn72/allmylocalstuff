package com.java.core;

public class Hai {
	private int a;
	private String msg;

	public Hai() {
		// TODO Auto-generated constructor stub
	}

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
