package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(10, "dhiraj"));
		list.add(new Student1(99, "kumar"));
		list.add(new Student1(55, "apple"));
		list.add(new Student1(87, "alok"));
		list.add(new Student1(22, "Ranjan"));
		list.add(new Student1(77, "lohar"));

		for (Student1 st1 : list) {
			System.out.println(st1);
		}
		System.out.println("**********");
		Collections.sort(list);
		for (Student1 st1 : list) {
			System.out.println(st1);
		}
	}
}

class Student1 implements Comparable {
	int sid;
	String sname;

	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(int sid, String sname) {
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
	public String toString() {
		return sid + " " + sname;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student1) {
			Student1 student1 = (Student1) o;
			return student1.sname.compareTo(this.sname) ;
		}
		return 0;
	}
}
