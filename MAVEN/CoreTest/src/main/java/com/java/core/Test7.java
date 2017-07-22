package com.java.core;

public class Test7 {

	public static void main(String[] args) throws Exception {

		Class cl = Class.forName("com.java.core.Test6");
		Test6 t6 = (Test6) cl.newInstance();
		System.out.println(t6);

	}

}
