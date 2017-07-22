package com.java.core;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("src/data1.txt"));
		// System.out.println("Enter Integer no:");
		while (scanner.hasNext()) {
			int x = scanner.nextInt();
			Fact fact = new Fact();
			double result = fact.fact(x);
			System.out.println("Factorial of " + x + " is " + result);
		}
	}
}

class Fact {
	public double fact(double n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

}
