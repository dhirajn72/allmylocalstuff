package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(10, "dhiraj"));
		list.add(new Student(99, "kumar"));
		list.add(new Student(55, "apple"));
		list.add(new Student(87, "alok"));
		list.add(new Student(22, "Ranjan"));
		list.add(new Student(77, "lohar"));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}

class Student implements Comparable {
	int sid;
	String sname;

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
	public String toString() {
		return sid + " " + sname;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student student = (Student) o;
			//return this.sid - student.sid;// Based on sid ASCENDING
			// return student.sid - this.sid;// Based on sid DESCENDING
			// return this.sname.compareTo(student.sname);// Based on sname
			// ASCENDING
			// return student.sname.compareTo(this.sname);// Based on sname
			// DESCENDING
		}

		return 0;
	}

}
