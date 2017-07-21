package com.java.test.wrapper;

public class Test1 {
	public static void main(String[] args) {
		Test1A test1a = new Test1A();
		byte b1 = 12;
		byte b2 = 13;
		test1a.print(b1, b2);

	}

}

class Test1A {
	/*
	 * Order of calling will be:
	 * 
	 * 
	 * 	
	 */ 
	
	public void print(byte b1, byte b2) {
		System.out.println("print(byte b1,byte b2) called");
	}

	public void print(int b1, int b2) {
		System.out.println("print(int b1,int b2) called");
	}

	public void print(Byte b1, Byte b2) {
		System.out.println("print(Byte b1,Byte b2) called");
	}

	public void print(byte... bytes) {
		System.out.println("print(var args ) called");
		System.out.println(bytes.length);
		for (byte b : bytes) {
			System.out.print(b + " ");
		}
	}
}
