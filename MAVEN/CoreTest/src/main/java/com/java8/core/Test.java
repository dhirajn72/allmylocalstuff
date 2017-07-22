package com.java8.core;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String exp1 = "[0-9]*";
		String exp2 = "^[a-zA-Z][0-9]*";
		String exp3 = "^[0-9][a-zA-Z]*";

		try {
			System.out.println("Enter something: ");
			Scanner scanner = new Scanner(System.in);
			String string = scanner.next();
			if (string.matches(exp1)) {
				System.out.println("Its integer:" + string);
			} else if (string.length() == 1) {
				System.out.println("Its char :" + string);
			} else if (string.matches(exp2) || string.matches(exp3)) {
				System.out.println("Its Aplphanumeric:" + string);
			} else {
				System.out.println("Its String:" + string);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
