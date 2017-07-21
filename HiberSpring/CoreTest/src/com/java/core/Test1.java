package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(34, "dhiraj", "dk@gmail.com", 9743854499l));
		employees
				.add(new Employee(54, "kumar", "kumar@gmail.com", 9743854499l));
		employees.add(new Employee(24, "alok", "alok@gmail.com", 9743854499l));
		employees.add(new Employee(76, "ranjan", "ranjan@gmail.com",
				9743854499l));
		employees
				.add(new Employee(23, "lohar", "lohar@gmail.com", 9743854499l));
		employees.add(new Employee(98, "sri", "sri@gmail.com", 9743854499l));
		employees
				.add(new Employee(31, "raghu", "raghu@gmail.com", 9743854499l));
		// Arrays.sort(employees, new EmpIdComparator());
		Collections.sort(employees, new EmpIdComparator());

		for (Employee e : employees) {
			System.out.println(e);
		}

	}
}

class EmpIdComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Employee && o2 instanceof Employee) {
			// System.out.println("compare called");
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			return e1.eid - e2.eid;

		}
		return 0;
	}
}

class Employee implements Comparable {
	int eid;
	String ename;
	String email;
	long phone;

	public Employee() {
	}

	public Employee(int eid, String ename, String email, long phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.phone = phone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Comparable) {
			System.out.println("compareTo called");
			Employee e = (Employee) obj;
			return this.eid - e.eid;
		}
		return 0;

	}

	@Override
	public String toString() {
		return eid + " " + ename + " " + email + " " + phone;
	}

}
