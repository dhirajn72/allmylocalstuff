package com.java.core.stringBuilder;

public class Test1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.ensureCapacity(5);
		System.out.println(sb.capacity());
		String s1 = "Hi how are you";
		StringBuilder s2 = new StringBuilder("Hi how are you");
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println("*************");
		System.out.println(s2.reverse());
		StringBuilder builder = new StringBuilder("hello");
		StringBuilder builder2 = new StringBuilder("hello");
		String s3 = new String(builder);
		String s4 = new String(builder2);

		System.out.println(builder.equals(builder2));
		builder.insert(3, true);
		System.out.println(builder);
		builder.deleteCharAt(1);
		System.out.println(builder);
		// StringBuilder builder3 = new StringBuilder(null);
		// System.out.println(builder3);
		StringBuilder builder4 = new StringBuilder();
		System.out.println(builder4);
		System.out.println(s4.equals(builder4));
		String string = "A";
		StringBuilder builder3 = new StringBuilder("A");
		System.out.println(string.hashCode());
		System.out.println(builder3.hashCode());

	}

}
