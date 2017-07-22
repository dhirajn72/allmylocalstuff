package com.java.core.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test2 {
	public static void main(String[] args) {

		try {
			System.setOut(new PrintStream("src/data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hi how are you");

	}
}
