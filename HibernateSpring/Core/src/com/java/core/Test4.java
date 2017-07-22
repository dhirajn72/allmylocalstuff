package com.java.core;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
	public static void main(String[] args) {

		Map<Student, Student> map = new HashMap<Student, Student>();

		map.put(new Student(99, "dk"), new Student(88, "Kumar"));
		map.put(new Student(99, "dk"), new Student(88, "Kumar"));
		map.put(new Student(99, "dk"), new Student(88, "Kumar"));
		map.put(new Student(99, "dk"), new Student(88, "Kumar"));
		map.put(new Student(99, "dk"), new Student(88, "Kumar"));
		map.put(new Student(99, "dk"), new Student(89, "singh"));

		System.out.println(map);

	}
}
