package com.java8.features1;

import java.util.ArrayList;
import java.util.List;

import com.java8.features1.interface1.inter1;
import com.java8.features1.interface2.inter2;
import com.java8.features1.interface3.inter3;

public class LambdaExpression {
	public static void main(String[] args) {

		inter1 name = (int a, int b) -> {
			System.out.println(a + " " + b);
			return a + b;
		};
		/*
		 * inter2 name2 = (String msg) -> { };
		 */
		inter2 name3 = (String msg) -> {
			System.out
					.println("Implementation under lambda expression: " + msg);
		};

		System.out.println(name.addition(5, 7));
		name3.sayHello("Hi dhiraj");

		inter3 name2 = () -> {
			List<String> list = new ArrayList<String>();
			list.add("dhiraj");
			list.add("singh");
			list.add("kumar");
			list.add("sri");
			return list;
		};

		inter3 name4 = () -> {
			List<String> list = new ArrayList<String>();
			list.add("dhiraj");
			list.add("singh");
			list.add("kumar");
			list.add("sri");
			list.add("singh");
			list.add("kumar");
			list.add("sri");
			list.add("singh");
			list.add("kumar");
			list.add("sri");
			return list;
		};

		for (String s : name2.getList()) {
			System.out.println(s);
		}
		System.out.println("****************");
		for (String s : name4.getList()) {
			System.out.println(s);
		}

	}

}
