package com.java.core;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test5 {
	public static void main(String[] args) {

		TreeSet<Student2> set = new TreeSet<Student2>(new STUComparator());
		set.add(new Student2(66, "dhiraj"));
		set.add(new Student2(34, "kumar"));
		set.add(new Student2(63, "singh"));
		set.add(new Student2(12, "alok"));
		set.add(new Student2(95, "ranjan"));
		set.add(new Student2(76, "bijon"));
		set.add(new Student2(23, "rajjo"));

		System.out.println(set);
	}
}

class Student2 {
	int sid;
	String sname;

	public Student2() {
		// TODO Auto-generated constructor stub
	}

	public Student2(int sid, String sname) {
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

}

class STUComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 s1 = (Student2) o1;
			Student2 s2 = (Student2) o2;
			// return s2.sname.compareTo(s1.sname);
			return s1.sid - s2.sid;

		}
		return 0;
	}
}