package com.java.core;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		try {
			int k = 0;
			FileInputStream fileInputStream = new FileInputStream(
					"src/main/resources/data.txt");
			// Scanner scanner = new Scanner(fileInputStream);
			/*
			 * while (scanner.hasNext()) { System.out.print(scanner.next() +
			 * " "); }
			 */

			while ((k = fileInputStream.read()) != -1) {
				System.out.print((char) k);
			}
			fileInputStream.close();
			System.out.println();
			System.out.println("Reading data from file is over !!");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
