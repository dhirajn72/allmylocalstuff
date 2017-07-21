package com.java.core;

public class Test1 {
	public static void main(String[] args) {
		new TryCatchTest().show();
	}
}

class TryCatchTest {
	void show() {
		System.out.println("STMT-1");

		try {
			System.out.println("STMT-2");
			try {
				int x = 10 / 0;
				System.out.println("STMT-3");
			} catch (Exception e) {

				try {
					int x = 10 / 0;
				} catch (Exception e2) {

					System.out.println("STMT-4");
				}
				// System.out.println("STMT-4");
			} finally {

				System.out.println("STMT-5");
			}
			System.out.println("STMT-6");
		} catch (Exception e1) {

			System.out.println("STMT-7");
			try {
				System.out.println("STMT-8");
			} catch (Exception e2) {
				System.out.println("STMT-9");
			} finally {
				System.out.println("STMT-10");
			}
			System.out.println("STMT-11");
		} finally {
			System.out.println("STMT-12");
			try {
				System.out.println("STMT-13");
			} catch (Exception e3) {
				System.out.println("STMT-14");
			} finally {
				System.out.println("STMT-15");
			}
			System.out.println("STMT-16");
		}
		System.out.println("STMT-17");
	}

}
