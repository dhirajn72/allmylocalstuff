/**
 * 
 */
package com.java.oops;

/**
 * @author Dhiraj Singh
 * @website dhiraj.singh.90@facebook.com
 *
 */
public class Test6 {
	public static void main(String[] args) {

		Inter1 inter1 = new Test6A();
		// inter1.m1();
		Object object = inter1;
		System.out.println(inter1.toString());

	}
}

interface Inter1 {
	void m1();
}

class Test6A implements Inter1 {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.oops.Inter1#m1()
	 */
	@Override
	public void m1() {
		System.out.println("Test6A-m1()");
	}

	public void m2() {
		System.out.println("Test6A-m2()");

	}

}