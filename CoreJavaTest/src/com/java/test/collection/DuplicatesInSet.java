package com.java.test.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInSet {
	public static void main(String[] args) {
		Employee e1 = new Employee(90, "dhiraj");
		Employee e2 = new Employee(90, "dhiraj");
		Employee e3 = new Employee(90, "dhiraj");
		Employee e4 = new Employee(90, "dhiraj");

		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println(employees);

	}

}

class Employee {
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called");
/*
		if (obj instanceof Employee) {
			if (this.eid == ((Employee) obj).eid
					&& this.ename.equals(((Employee) obj).ename)) {
				return true;
			}
		}*/
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode called " + super.hashCode());
		return 90;
	}

}
