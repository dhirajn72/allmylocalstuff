package com.java.core;

import java.io.IOException;
import java.io.PrintStream;

public class Test13 {
	public static void main(String[] args) throws IOException {
		MyArrayList list = new MyArrayList();

		System.setOut(new PrintStream("src/data.txt"));

		System.out.println("Done !!");
	}
}
