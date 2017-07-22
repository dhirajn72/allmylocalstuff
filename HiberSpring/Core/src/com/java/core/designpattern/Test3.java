package com.java.core.designpattern;

import com.java.core.oops.AbsTest1;

public class Test3 {
	public static void main(String[] args) {

		AbsTest1 absTest1 = new AbsTest1Impl();
		absTest1.m1();
		System.out.println(absTest1.a);

	}
}
