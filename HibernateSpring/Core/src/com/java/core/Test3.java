package com.java.core;

import java.util.HashSet;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(99, "dk"));
		hashSet.add(new Student(99, "dk"));
		hashSet.add(new Student(99, "dk"));
		hashSet.add(new Student(98, "dk"));
		hashSet.add(new Student(99, "dk"));
		System.out.println(hashSet);

		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student(99, "DK"));
		treeSet.add(new Student(99, "DK"));
		treeSet.add(new Student(95, "DK"));
		treeSet.add(new Student(99, "DK"));
		treeSet.add(new Student(99, "DK"));
		System.out.println(treeSet);

	}
}

class Student implements Comparable<Student> {
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
	public int hashCode() {
		return sid;
	}

	@Override
	public boolean equals(Object obj) {
		/*if (obj instanceof Student) {
			Student student = (Student) obj;
			return this.sid == student.sid;
		}*/
		return false;
	}

	@Override
	public String toString() {
		return sid + " " + sname;
	}

	@Override
	public int compareTo(Student o) {
		return /*this.sid - o.sid*/ 1;

	}

}
