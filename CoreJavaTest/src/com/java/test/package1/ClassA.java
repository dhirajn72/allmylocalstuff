package com.java.test.package1;

public class ClassA {

	private int a = 20;
	protected String name = "Dhiraj";
	long value = 100l;
	public String age = "25";

	public void show(){
		System.out.println(a);
		System.out.println(name);
		System.out.println(value);
		System.out.println(age);
		
	}
	
	@Override
	public String toString() {
		return a + " " + name + " " + value + " " + age;
	}

}
