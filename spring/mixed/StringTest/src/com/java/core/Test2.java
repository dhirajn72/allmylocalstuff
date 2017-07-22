package com.java.core;

public class Test2 {
	public static void main(String[] args) {
	int h=0;
	h=h ^ (h >>> 7) ^ (h >>> 4);
	System.out.println(h);

	}
}
