/**
 * 
 */
package com.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(67, "dhiraj"));
		list.add(new Student(87, "kumar"));
		list.add(new Student(97, "singh"));
		list.add(new Student(65, "alok"));
		list.add(new Student(83, "sri"));
		list.add(new Student(32, "nivas"));
		list.add(new Student(84, "dande"));
		list.add(new Student(43, "ranjan"));
		System.out.println(list);
		Collections.sort(list, new StuComparator());
		System.out.println(list);

	
	}
}

class StuComparator implements Comparator {
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
			return s2.sid - s1.sid;
		}
		return 0;
	}

}

class Student {
	int sid;
	String sname;

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sid
	 * @param sname
	 */
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
