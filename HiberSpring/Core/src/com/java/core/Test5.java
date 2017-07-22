package com.java.core;

import java.io.PrintStream;

public class Test5 {
	public static void main(String[] args) {

		try {
			System.setErr(new PrintStream("/home/dhiraj/data.txt"));
			Class cls = Class.forName("com.java.core.Hello");
			Hello h = (Hello) cls.newInstance();

			System.out.println(h);
			System.out.println("********");
			Hello h2 = Hello.class.newInstance();
			System.out.println(h2);
			System.out.println("***********");
			Hello h3 = (Hello) h2.clone();
			System.out.println(h3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Hello implements Cloneable {
	public Hello() {
		System.out.println("Hello-DC");
	}

	static void m1() {
		System.out.println("Hello- m1()");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Hello h = null;
		if (this instanceof Cloneable) {
			h = (Hello) this.clone();
		}
		return h;
	}
}
