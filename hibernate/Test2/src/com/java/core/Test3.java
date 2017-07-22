package com.java.core;

public class Test3 {

	public static void main(String[] args) {
		C c = new C();
		c.m1(null);
	}
}

class C {
	/*public void m1(Integer in) {
		System.out.println("Integer");
	}*/
	public void m1(Object in) {
		System.out.println("Object");
	}
	public void m1(String in) {
		System.out.println("String");
	}


}
