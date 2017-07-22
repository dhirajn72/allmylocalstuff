package com.java.core;

public class Test9 {

	public static void main(String[] args) {
		new Y(10);
	}

}

class X {
	public X() {
		// TODO Auto-generated constructor stub
	}

	public X(Object ob) {
		System.out.println("X-DC");
	}
}

class Y extends X {

	public Y(int x) {
		// super(this);
		System.out.println("Y-DC");
	}
}