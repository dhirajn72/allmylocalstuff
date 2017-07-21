package com.java.test.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet<Employee1> set = new TreeSet<Employee1>();

		set.add(new Employee1(99, "dhiraj"));
		set.add(new Employee1(93, "dhiraj"));
		set.add(new Employee1(92, "dhiraj"));
		set.add(new Employee1(96, "dhiraj"));
		System.out.println(set);
		System.out.println("***********");

		Iterator<Employee1> it = set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			//set.add(new Employee1(89, "Singh"));
		}
	}
}

class Employee1 implements Comparable {

	int eid;
	String ename;

	public Employee1(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(Object ob) {
		if (ob instanceof Employee1) {
			return this.eid - ((Employee1) ob).eid;
		}
		return 0;
	}

}
