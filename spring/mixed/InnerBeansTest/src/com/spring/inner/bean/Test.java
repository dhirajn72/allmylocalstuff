/**
 * 
 */
package com.spring.inner.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Test {
	@Autowired
	private Person person;
	@Autowired
	private Person.Student student;
	@Autowired
	private Person.Employee employee;

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person.Student getStudent() {
		return student;
	}

	public void setStudent(Person.Student student) {
		this.student = student;
	}

	public Person.Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Person.Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return person + " " + student + " " + employee;
	}

}
