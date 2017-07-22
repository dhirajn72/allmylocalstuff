package com.java.core;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something:");
		String val = scanner.next();
		if (Utility.checkNumber(val)) {
			System.out.println("You have entered number: " + val);
		} else {
			System.out.println("This is not number: " + val);
		}

	}
}

class Utility {

	public static boolean checkNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
