package com.java.core.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add(new Student(99, "Dhiraj"));
		treeSet.add(new Student(65, "Singh"));
		treeSet.add(new Student(92, "Kumar"));
		treeSet.add(new Student(32, "Asif"));
		treeSet.add(new Student(76, "mubarak"));
		treeSet.add(new Student(55, "raju"));
		treeSet.add(new Student(101, "manish"));
		treeSet.add(new Student(12, "sri"));
		// treeSet.add(null);//java.lang.NullPointerException

		Iterator iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}

class Student implements Comparable {
	int sid;
	String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Comparable) {
			Student student = (Student) obj;
			// return this.name.compareTo(student.name);
			return this.sid - student.sid;

		} else {
			throw new ClassCastException();
		}

	}

	@Override
	public String toString() {
		return sid + " " + name;
	}

}