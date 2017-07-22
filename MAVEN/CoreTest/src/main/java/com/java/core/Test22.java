package com.java.core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		String regex = "[0-9]*";
		List<Integer> integers = new ArrayList<Integer>();

		try {

			FileInputStream fis = new FileInputStream(
					"src/main/resources/data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			Scanner sc = new Scanner(bis);
			while (sc.hasNext()) {
				String token = sc.next();
				if (token.matches(regex)) {
					integers.add(Integer.parseInt(token));
				}
			}
			System.out.println("Integers are:");
			for (int val : integers) {
				System.out.print(val + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
