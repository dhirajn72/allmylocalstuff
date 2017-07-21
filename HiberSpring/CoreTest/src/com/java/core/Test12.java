package com.java.core;

import java.io.PrintStream;

public class Test12 {
	public static void main(String[] args) throws Exception {

		System.out.println("hi");
		PrintStream printStream = System.out;
		System.setOut(new PrintStream("src/sys.txt"));
		System.out.println("this has to be written in file");
		System.setOut(printStream);
		System.out.println("this has to be written on console");

	}
}
