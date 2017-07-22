/**
 * 
 */
package com.java.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test5 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		List<String> strings = new ArrayList<String>();

		try {
			Scanner scanner = new Scanner(new File("/home/dhiraj/data.doc"));
			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					// scanner.nextInt();
					integers.add(scanner.nextInt());
				} else if (scanner.hasNextLine()) {
					strings.add(scanner.nextLine());
				}
			}
			scanner.close();
			System.out.println("Strings->" + strings);
			System.out.println("Integers->" + integers);
			/*
			 * for (String s1 : strings) { System.out.print(s1 + ""); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
