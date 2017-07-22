package com.java.core;

public class Test1 {
	public static void main(String[] args) {
		Hello h = new Hello();

	}
}

class Hello {
	int a = 10;
	{
		System.out.println("IIB1:" + a);// 
		System.out.println("IIB1:" + this.b);// 0
	}
	int b = 20;// a=20
	{
		System.out.println("IIB2:" + a);// 20
		System.out.println("IIB1:" + b);// 0
	}

}