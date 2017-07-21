package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int eid;
	String ename;
	String email;
	String phone;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String email, String phone) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return eid + " " + ename + " " + email + " " + phone;
	}

}

class SortById implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Employee && o2 instanceof Employee) {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			return e2.eid - e1.eid;
		}
		return 0;
	}
}

class SortByName implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Employee && o2 instanceof Employee) {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			return e1.ename.compareToIgnoreCase(e2.ename);
			// return e1.ename.compareTo(e2.ename);
		}
		return 0;
	}
}

public class ComparatorTest {
	public static void main(String[] args) {

		Employee employee = new Employee(99, "dhiraj",
				"dhirajkr.info@gmail.com", "9743854499");
		Employee employee2 = new Employee(54, "Singh",
				"dhirajkr.info@gmail.com", "9743854499");
		Employee employee3 = new Employee(65, "apple",
				"dhirajkr.info@gmail.com", "9743854499");
		Employee employee4 = new Employee(23, "alok",
				"dhirajkr.info@gmail.com", "9743854499");
		Employee employee5 = new Employee(76, "ranjan",
				"dhirajkr.info@gmail.com", "9743854499");
		Employee employee6 = new Employee(12, "lohar",
				"dhirajkr.info@gmail.com", "9743854499");
		Employee employee7 = new Employee(72, "raghu",
				"dhirajkr.info@gmail.com", "9743854499");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);

		for (Employee e : employees) {
			System.out.println(e);
		}
		System.out.println("*****Sorting By ID********");
		Collections.sort(employees, new SortById());
		for (Employee e : employees) {
			System.out.println(e);
		}
		System.out.println("*****Sorting By Name********");
		Collections.sort(employees, new SortByName());
		for (Employee e : employees) {
			System.out.println(e);
		}

	}

}
