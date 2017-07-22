/**
 * 
 */
package com.java.file;

import java.io.File;
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
public class Test2 {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("/home/dhiraj/names.txt"));
			String string = sc.nextLine();
			System.out.println(string);
			List list = Arrays.asList(string.split(" "));
			Set set = new HashSet(list);
			for (Object ob : set) {
				System.out
						.println(ob + "-->" + Collections.frequency(list, ob));
			}

			System.out.println(string);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
