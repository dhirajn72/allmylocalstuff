package com.java.core.designpattern;

public class Test1 {

	public static void main(String[] args) {

		Hello s1=Student.getHello();
		Hello s2=Student.getHello();
		Hello s3=Student.getHello();
		Hello s4=Student.getHello();
		Hello s5=Student.getHello();
		Hello s6=Student.getHello();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
	}

}

class Student {
	private Student() {
	}

	private static Hello hello;
	static {
		hello = new Hello();
	}

	public static Hello getHello() {
		return hello;
	}

}

class Hello {

}