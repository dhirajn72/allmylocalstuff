package com.java.packag;

import com.java.packag.hello.Hello;

public class Test1 {
	public static void main(String[] args) {
		new B().show();

	}

}

class A extends Hello {
	@Override
	protected void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}
}

class B extends Hello {
	public void show() {
		A a = new A();
		a.m1();
	}
}