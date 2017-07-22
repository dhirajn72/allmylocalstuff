package com.java.p2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test4 {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("com.java.p2.Temp");
			System.out.println(c.getCanonicalName());
			System.out.println(c.getModifiers());
			Constructor[] cons = c.getConstructors();
			for (Constructor co : cons) {
				System.out.println(co);
			}
			System.out.println("************************");
			Method[] method = c.getMethods();
			for (Method m : method) {
				System.out.println(m);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Temp {
	int a;
	String str;

	public Temp() {
		// TODO Auto-generated constructor stub
	}

	public Temp(int a) {
		// TODO Auto-generated constructor stub
	}

	public Temp(int a, String s) {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}