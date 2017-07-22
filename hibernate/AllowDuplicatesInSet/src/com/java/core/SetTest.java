package com.java.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {

	private int eid;
	private String ename;

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	/*
	 * overriding equals method saying even if two objects are having same eid
	 * and ename still they are not equal, means you are giving your own
	 * definition of equals
	 */

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;

		if (this.eid == ((Employee) obj).eid
				&& this.ename == ((Employee) obj).ename)
			return false;
		return false;
	}

	/* overriding hashcode() method to generate hashcode based on its eid */

	public int hashCode() {
		return this.eid + 25;
	}
}

public class SetTest {

	public static void main(String[] args) {
		Set<Employee> test = new HashSet<Employee>();
		Employee t1 = new Employee(1, "sushil");
		Employee t2 = new Employee(1, "sushil");

		test.add(t1);
		test.add(t2);

		Iterator<Employee> its = test.iterator();
		while (its.hasNext()) {
			Employee value = (Employee) its.next();
			System.out.println("Value :" + value);
		}
	}
}