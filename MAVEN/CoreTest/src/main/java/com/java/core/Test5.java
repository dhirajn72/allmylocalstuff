package com.java.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test5 {
	public static void main(String[] args) {

		TreeSet employees = new TreeSet();
		employees.add(new Employee("78", "ranjan", "10000"));
		employees.add(new Employee("65", "raghu", "26000"));
		employees.add(new Employee("98", "dhiraj", "45000"));
		employees.add(new Employee("23", "alok", "35000"));
		employees.add(new Employee("45", "firdaus", "41000"));
		employees.add(new Employee("48", "lohar", "25000"));

		System.out.println("Before sorting:");
		for (Object e : employees) {
			System.out.println(e);
		}
		// Collections.sort(employees);

		/*
		 * System.out.println("after sorting:"); for (Object e : employees) {
		 * System.out.println(e); }
		 */
	}
}

class Employee {
	private String eid;
	private String name;
	private String sallary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, String name, String sallary) {
		super();
		this.eid = eid;
		this.name = name;
		this.sallary = sallary;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSallary() {
		return sallary;
	}

	public void setSallary(String sallary) {
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return eid + " " + name + " " + sallary;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() called");
		/*
		 * Long l1 = Long.parseLong(this.sallary); Long l2 =
		 * Long.parseLong(((Employee) obj).sallary); return l1 == l2;
		 */
		String sal = ((Employee) obj).sallary;
		return this.sallary.equals(sal);

	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() called");
		return 1;
	}

}