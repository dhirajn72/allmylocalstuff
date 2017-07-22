package com.java.core;

public class FibbonacciSeries {
	public static void main(String[] args) {
		for (int f = 0; f < 10; f++) {
			System.out.print(Fibbonacci.findFibbonacci(f) + ", ");
		}
	}
}

class Fibbonacci {
	public static long findFibbonacci(int n) {
		return n == 0 ? 0 : (n == 1 ? 1
				: (findFibbonacci(n - 1) + findFibbonacci(n - 2)));
	}
}
