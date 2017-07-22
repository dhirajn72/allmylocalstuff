package com.java.core;

public class Test14 {
	public static void main(String[] args){
		int a = 0;

		if (a == 0) {
			throw new ExceptionTest();
		} else {
			System.out.println("OK");
		}
	}
}

class ExceptionTest extends RuntimeException {

	public ExceptionTest() {
	}

	public ExceptionTest(String msg) {
		super(msg);
	}

}