package com.java.core;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting integer no:");
		int index = sc.nextInt();
		System.out.println("Enter last  integer no:");
		int dest = sc.nextInt();
		int count = 0;
		try {
			String str;
			PrintStream printStream = new PrintStream(new FileOutputStream(
					"/home/dhiraj/even.txt"));
			for (int i = index; i <= dest; i++) {
				if (i % 2 == 0) {
					count++;
					System.out.println("Even no are:" + i);
					System.setOut(printStream);
					 str = "Even no are:" + i;

				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Total no's are:" + count);

	}
}
