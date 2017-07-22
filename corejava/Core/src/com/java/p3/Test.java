package com.java.p3;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(1000000000);
		System.runFinalization();
		System.gc();
	}
}

class Student {

}