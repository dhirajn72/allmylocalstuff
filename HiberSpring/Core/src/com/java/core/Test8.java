package com.java.core;

public class Test8 {
	public static void main(String[] args) {

		try {
			Class cls = Class.forName("com.java.core.JLC");
			JLC jlc = (JLC) cls.newInstance();
			System.out.println(jlc);
			System.out.println("************");

			JLC jlc2 = new JLC(88, "DK", "dk@gmail.com", "9743854499");
			System.out.println(jlc2);
			JLC jlc3 = (JLC) jlc2.clone();
			System.out.println(jlc3);
			System.out.println("*******");
			jlc2.setSname("SINGH");
			System.out.println(jlc2);
			System.out.println(jlc3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
