package com.java.core;

public class Test {
	public static void main(String[] args) {

		Directions d = Directions.EAST;
		d.a = 99;
		d.b = 99;
		System.out.println(d);
		// Directions.Inner.A;

	}
}

enum Directions {

	EAST() {
		public void m1() {
		}
	},
	WEST(90) {
		public void m1() {
		}
	},
	NORTH(88, 99) {
		public void m1() {
		}
	},
	SOUTH(77, 88, 99) {
		public void m1() {
		}
	};
	private Directions() {

	}

	private Directions(int a) {
		this.a = a;

	}

	private Directions(int a, int b) {
		this.a = a;
		this.b = b;

	}

	private Directions(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	@Override
	public String toString() {
		return a + " " + b + " " + c;
	}

	int a;
	int b;
	int c;

	enum Inner {
		A, B, C;
	}

}

interface TestB {
	void m1();

}
