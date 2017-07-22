package com.java.core;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		List<String> strings = new ArrayList<String>();

		String exp1 = "^[0-9]*";
		try {
			Scanner scanner = new Scanner(new File("src/data.txt"));
			while (scanner.hasNext()) {
				String str = scanner.next();
				if (str.matches(exp1)) {
					integers.add(Integer.parseInt(str));
				} else {
					strings.add(str);
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
