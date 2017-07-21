package com.java.test.misc;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Super s= new Base();
		System.out.println(s.x);//100
		Base b= new Base();
		System.out.println(b.x);//99
		System.out.println(((Base)s).x);


	}
}

class Super {
	int x = 100;
}

class Base extends Super {
	int x = 99;
}
