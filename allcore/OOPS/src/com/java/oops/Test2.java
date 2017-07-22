/**
 * 
 */
package com.java.oops;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test2 {
public static void main(String[] args) {
	Hello hello=new Hello();
	System.out.println(hello.a);
}
}

class Hello {
	{
		this.a = 90;
	}
	int a = 20;
}
