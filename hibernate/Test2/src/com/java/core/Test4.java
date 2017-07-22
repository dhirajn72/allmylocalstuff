package com.java.core;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("main:" + Hello1.a);
		new Hello1();
	}
}

class Hello1 {

	static int a = 10;
	{
		System.out.println("iib:" + a);
		Hello1 h = new Hello1();
	}

}
