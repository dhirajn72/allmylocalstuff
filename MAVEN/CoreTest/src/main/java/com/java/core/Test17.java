package com.java.core;

public class Test17 {
	public static void main(String[] args) {
		TryCatchTest tryCatchTest = new TryCatchTest();
		int x = tryCatchTest.method();
		System.out.println(x);
	}
}

class TryCatchTest {

	public int method() {

		try {
			System.out.println("try");
			return 10 / 0;

		} catch (Exception e) {
			System.out.println("catch");
			int a = 20 / 0;
		}

		System.out.println("unreachable");
		return 10;
	}

}
