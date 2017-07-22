/**
 * 
 */
package com.java.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(98, "Singh"));
		list.add(new Student(23, "kumar"));
		list.add(new Student(65, "dhiraj"));
		list.add(new Student(78, "dande"));
		list.add(new Student(21, "sri"));
		System.out.println(list);

		Collections.sort(list, new STUComparator());
		System.out.println(list);

	}
}

class STUComparator implements Comparator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.sname.compareTo(s2.sname);

		}
		return 0;
	}
}

class Student {
	int sid;
	String sname;

	/**
	 * @param sid
	 * @param sname
	 */
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname) {
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

}
