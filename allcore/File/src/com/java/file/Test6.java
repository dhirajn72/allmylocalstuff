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
public class Test6 {
	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		List<Integer> integers = new ArrayList<Integer>();

		try {
			Scanner scanner = new Scanner(new File("/home/dhiraj/data.doc"));

			while (scanner.hasNext()) {
				// System.out.println(scanner.next());
				if (scanner.hasNextInt()) {
					integers.add(scanner.nextInt());
				} else if (scanner.hasNextLine()) {
					strings.add(scanner.nextLine());
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

class Test {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
