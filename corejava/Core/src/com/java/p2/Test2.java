package com.java.p2;

import com.java.p1.Hello;

class Test2 {
	public static void main(String[] args) {
		new D().show();
	}
}

class C extends Hello {

}

class D extends Hello {
	void show() {
		C c = new C();
		// c.m1();
	}

}
