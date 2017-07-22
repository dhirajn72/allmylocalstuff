package com.java.core;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
	public static void main(String[] args) throws IOException {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(99, "dk"));
		list.add(new Student(56, "sk"));
		list.add(new Student(89, "mk"));
		list.add(new Student(12, "ak"));
		list.add(new Student(78, "dk"));
		list.add(new Student(42, "rk"));
		System.setOut(new PrintStream("/home/dhiraj/com.txt"));
		System.out.println(list);
		// Arrays.sort(list.toArray());
		Collections.sort(list, new StuComparator());
		System.out.println(list);

	}
}

class StuComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s2.getSname().compareTo(s1.getSname());
		}
		return 0;
	}
}

class Student implements Comparable {

	private int sid;
	private String sname;

	public Student() {
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Comparable) {
			Student st = (Student) o;
			return st.sname.compareTo(this.sname);
		}
		return 1;
	}

	@Override
	public String toString() {
		return sid + " " + sname;
	}

}
