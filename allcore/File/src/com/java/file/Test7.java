/**
 * 
 */
package com.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test7 {
	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		List<Integer> integers = new ArrayList<Integer>();

		try {
			String string1 = "^[0-9]*";
			String string2 = "^[0-9][a-zA-z0-9]*";

			Scanner scanner = new Scanner(new File("/home/dhiraj/data.doc"));

			//PrintStream printStream = new PrintStream("/home/dhiraj/out.txt");
			//System.setOut(printStream);

			String string4 = "";
			while (scanner.hasNext()) {
				string4 = scanner.next();
				if (string4.matches(string1)) {
					integers.add(Integer.parseInt(string4));
				} else if (string4.matches(string2)) {
					strings.add(string4);
				} else {
					strings.add(string4);
				}
			}
			System.out.println("Integers are:");
			for (Integer it : integers) {
				System.out.print(it + " ");
			}
			System.out.println();
			System.out.println("Strings are:");
			for (String it : strings) {
				System.out.print(it + " ");
			}

			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
