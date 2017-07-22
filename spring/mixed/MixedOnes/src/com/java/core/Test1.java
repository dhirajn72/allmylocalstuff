package com.java.core;

public class Test1 {
	public static void main(String[] args) {

		String s1 = "capgemini";
		String s2 = s1;
		System.out.println(s1 == s2);
		s2 = s2 + "";
		System.out.println(s1 == s2);
		// System.out.println(s1.hashCode() + " " + s2.hashCode());

	}
}

abstract class Hello {

	public abstract void m1();

	public abstract void m2();

	public void m3() {

	}

	public void m4() {

	}

}

class Hai extends Hello{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}