/**
 * 
 */
package com.java.oops;

/**
 * @author Dhiraj Singh
 * @website dhiraj.singh.90@facebook.com
 *
 */
public class Test7 {

	public static void main(String[] args) {
		Test7B test7a=new Test7B();
		test7a.m1();
	}
}

abstract class Test7A {
}

class Test7B extends Test7A {

	public void m1() {
System.out.println("M1");
	}

}
