package com.java.core;

public class Test15 {
	public static void main(String[] args) {
		Inner1.Inner2 inner2 = new Inner1.Test();
		inner2.m1();
		System.out.println();
		Inner1.Inner2 inner22 = new Test_B();
		inner22.m1();

	}
}

class Test_B implements Inner1.Inner2 {
	@Override
	public void m1() {
		System.out.println("Test_B-m1()");
	}

}

class TestC implements Inner1 {
	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}

interface Inner1 {

	void m1();

	interface Inner2 {
		void m1();

	}

	class Test implements Inner2 {
		int a = 0;
		static int b = 88;
		static {
			System.out.println("Test-SIB");
		}
		{
			System.out.println("Test-IIB");
		}

		@Override
		public void m1() {
			System.out.println("Test-m1()");
		}
	}

}

abstract class Testing {
	interface Inner1 {

	}
}