package com.java.test.package1;

public class Test {
	public static void main(String[] args) {
		
		Hello h= new Hello();
		//h.m1(new int[]{10,20});// allowed because its an array
		//h.m1(10); // not allowed
		//h.m2(); not visible
		

	}

}

class Hello {
	/**
	 * parameters are of array type
	 * @param args
	 */
	public void m1(int[]... args) {
		System.out.println("m1(int... args) called");

	}
	private  void m2(int[]... args) {
		System.out.println("m1(int... args) called");

	}
	
	
	
}