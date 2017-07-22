/**
 * 
 */
package com.java.file;

import java.io.File;
import java.util.ArrayList;
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
public class Test8 {
	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(new File("/home/dhiraj/data.doc"));
			while (scanner.hasNext()) {
				String s1 = scanner.next();
				// System.out.println(s1);
				strings.add(s1);

			}
			Set<String> strings2 = new HashSet<String>(strings);
			for (String s1 : strings2) {
				System.out.println(s1 + "->"
						+ Collections.frequency(strings, s1));

			}
			System.out.println("**************");
			String string = "my name is dhiraj singh";
			List<String> list = Arrays.asList(string.split(" "));
			System.out.println(string);
			Collections.reverse(list);
			String val = "";
			for (String s1 : list) {
				val = val + s1 + " ";
			}
			System.out.println(val);

			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
