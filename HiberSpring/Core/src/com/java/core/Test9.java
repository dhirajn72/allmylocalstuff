package com.java.core;

public class Test9 {
	public static void main(String[] args) {
		try {
			JLC jlc = (JLC) JLC.class.newInstance();
			JLC jlc2 = (JLC) jlc.clone();
			System.out.println(jlc);
			System.out.println(jlc2);
			jlc2.setPhone("9999999999");
			System.out.println(jlc);
			System.out.println(jlc2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
