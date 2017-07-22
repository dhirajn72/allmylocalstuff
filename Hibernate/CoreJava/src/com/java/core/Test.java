package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(98, "Dhiraj"));
		list.add(new Student(77, "kumar"));
		list.add(new Student(85, "singh"));
		list.add(new Student(55, "Alok"));
		list.add(new Student(34, "ranjan"));

		System.out.println(list);
		// Collections.sort(list, new STUComparator());
		System.out.println(list);

	}

}

class STUComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.getSname().compareTo(s2.getSname());

		}
		return 0;
	}
}
