package com.java.core;

public class FinalizeTest {
	public static void main(String[] args) {
		for (int i = 0; i < 500000; i++) {
			FinaliseDemo demo1 = new FinaliseDemo();
			FinaliseDemo demo2 = new FinaliseDemo();
			demo1 = demo2;
		}
	}
}

class FinaliseDemo {

	public FinaliseDemo() {
		System.out.println("DC");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() called");
	}

}