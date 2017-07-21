package com.java.test.singleton;

import java.io.Serializable;

public class Employee implements Serializable{

	private static Employee emp = new Employee();

	private Employee() {
	}

	public static Employee getEmployee() {
		return emp;
	}

	private Employee readResolve() {
		return emp;
	}

}
