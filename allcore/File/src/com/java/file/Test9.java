/**
 * 
 */
package com.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test9 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/out.txt");
			System.setIn(fileInputStream);
			Scanner scanner = new Scanner(fileInputStream);
			// PrintStream printStream = new
			// PrintStream("/home/dhiraj/out1.txt");
			// System.setOut(printStream);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("*************");
			System.out.println(Integer.MAX_VALUE);
			System.out.println(new BigDecimal(Long.MAX_VALUE));
			System.out.println(new BigDecimal(Double.MAX_VALUE));
			// System.out.println(new BigDecimal(Double.MIN_VALUE));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
