package com.java.core.wrapper;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Byte byte1 = 123;
		Byte byte2 = 123;
		System.out.println(byte1 == byte2);
		byte b = 124;
		Byte byte3 = new Byte(b);
		Byte byte4 = new Byte(b);
		System.out.println(byte3 == byte4);

		//Long long1 = 123;
		Long long1 = 123l;
		System.out.println(long1);
		System.out.println("*******************************");
		Properties p = System.getProperties();
		Set s = p.keySet();
		Enumeration e = p.elements();
		while (e.hasMoreElements()) {
			String pname = e.nextElement().toString();
			String val = System.getProperty(pname);
			System.out.println(pname + "-------------->" + val);
		}

	}

}
