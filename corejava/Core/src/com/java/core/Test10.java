package com.java.core;

public class Test10 {

	public static void main(String[] args) {

		String s1 = "99";

		String s2 = new String("a");
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("***********************");

		HashCode h = new HashCode(0, "a");
		System.out.println("Default Implementation:" + h);
		String name = h.getClass().getName();
		int h2 = h.hashCode();
		String s = Integer.toHexString(h2);
		System.out.println("Manual:"+name + "@" + s);

	}

}

class HashCode {
	int a;
	String str;

	public HashCode() {
	}

	public HashCode(int a, String str) {
		this.a = a;
		this.str = str;
	}
}