package com.java.test.enumTest;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(Test.WEST == Test.NORTH);
		Test t = Test.EAST;
		t.setX(190);
		System.out.println(t.EAST);
	}

}

enum Test {
	EAST(90), WEST, NORTH, SOUTH;

	int x;

	Test() {
	};

	Test(int x) {
		this.x = x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return ordinal() + "";
	}

}
