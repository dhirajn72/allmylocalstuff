/**
 * 
 */
package com.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {
	public static void main(String[] args) {

		Scanner scanner;
		try {
			scanner = new Scanner(new File("/home/dhiraj/data.doc"));
			String string = "";
			while (scanner.hasNext()) {
				string = string + scanner.nextLine();
			}
			System.out.println(string + " ");

			List<String> list = Arrays.asList(string.split(" "));
			Set<String> set = new HashSet<String>(list);
			for (String s1 : set) {
				System.out.println(s1 + "->" + Collections.frequency(list, s1));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
