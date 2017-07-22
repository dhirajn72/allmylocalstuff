package com.java.core;

public class Test3 {
	public static void main(String[] args) {

		double d = 99.99;
		System.out.println(d);
		char c = '\\';
		System.out.println(c);
		String str = "99999999999999999";
		long l = Long.parseLong(str);
		System.out.println(l);
		char ch = (char) 65535;
		System.out.print("ch:" + ch);
		String str1 = "\u0041";
		System.out.println(str1);
		float f = 127.98f;
		System.out.println(f);
		System.out.println("************");

		int b = 99;
		int e = --b;
		System.out.println(e);

		System.out.println("***********");
		final int a = 126;
		int b2 = +a;
		System.out.println(a + " " + b2);
		System.out.println("************");
		Test3 test3 = new Test3();
		Test3 test32 = new Test3();
		System.out.println(test3 == test32);

		Java j=new Java();
		j.m1();
	}

}

class Testing{
	public  final void m1() {
System.out.println("m1");
	}
}

class Java extends Testing{

}
