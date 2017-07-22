package com.java.core;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		String expression = "^[0-9]*";
		List<Integer> integers = new ArrayList<Integer>();
		List<String> strings = new ArrayList<String>();

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/info.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					fileInputStream);
			Scanner scanner = new Scanner(bufferedInputStream);
			while (scanner.hasNext()) {
				String str = scanner.next();
				if (str.matches(expression)) {
					integers.add(Integer.parseInt(str));
				} else {
					strings.add(str);
				}

			}

			System.out.println("Integers are:");
			for (Integer integer : integers) {
				System.out.print(integer + " ");
			}
			System.out.println();
			System.out.println("Strings are:");
			for (String string : strings) {
				System.out.print(string + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
