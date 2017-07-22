package com.java.core;

public class MainOverload {
	public static void main(String... args) {
		System.out.println("standard main()");
		main("singh");
	}

	public static void main(String args) {
		System.out.println("string main()");
		main(10);

	}

	public static void main(int args) {
		System.out.println("int main()");
		main(50l);
	}

	public static void main(long args) {
		System.out.println("long main()");
		main('A');
	}

	public static boolean main(char args) {
		System.out.println("char main()");
		return true;
	}
}
