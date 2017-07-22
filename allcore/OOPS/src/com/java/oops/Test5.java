/**
 * 
 */
package com.java.oops;

/**
 * @author Dhiraj Singh
 * @website dhiraj.singh.90@facebook.com
 *
 */
public class Test5 {
	public static void main(String[] args) {
		A a = new D();
		E e = new E();
		// System.out.println(a==e);
		System.out.println();

		B b = new B();
		C c = new C();
		// System.out.println(c == b);

	}

}

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E {
}
