package com.java.core;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		//System.out.println(b.show(10));

		String str = "HCL-002";
		String sub = str.substring(2,4);
		System.out.println(sub);//002


	}

}

class B {
	long show(int... arr) {
		System.out.println("show()");
		return 'A';
	}
}