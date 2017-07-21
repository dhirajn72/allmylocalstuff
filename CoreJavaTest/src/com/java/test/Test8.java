package com.java.test;

public class Test8 {
	public static void main(String[] args) {
		recursion(1);
		
		

	}

	public static void recursion(int i) {
		if (i <= 10) {
			System.out.println(i);
			recursion(i+1);
		}

	}

}
