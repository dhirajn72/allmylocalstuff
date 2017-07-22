/**
 * 
 */
package com.java.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test2 {

	public static void main(String[] args) {

		TreeSet<Student1> treeSet = new TreeSet<Student1>(new STUComparator1());
		treeSet.add(new Student1(99, "kumar"));
		treeSet.add(new Student1(87, "singh"));
		treeSet.add(new Student1(75, "dhiraj"));
		treeSet.add(new Student1(23, "sri"));
		treeSet.add(new Student1(60, "apple"));
		treeSet.add(new Student1(54, "dande"));
		System.out.println(treeSet);

	}
}

class STUComparator1 implements Comparator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Student1 && o2 instanceof Student1) {
			Student1 s1 = (Student1) o1;
			Student1 s2 = (Student1) o2;
			return s2.sid-s1.sid;

		}
		return 0;
	}
}

class Student1/* implements Comparable */{
	int sid;
	String sname;

	/**
	 * @param sid
	 * @param sname
	 */
	/**
	 * 
	 */
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname
	 *            the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return sid + " " + sname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Student1) {
			Student1 student1 = (Student1) o;
			return this.sname.compareTo(student1.sname);
		}
		return 0;
	}*/
}
