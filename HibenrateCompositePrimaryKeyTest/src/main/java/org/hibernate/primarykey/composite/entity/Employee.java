package org.hibernate.primarykey.composite.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Embedded
	private EmployeeID employeeID;

	@Column
	@Size(min = 2, max = 5, message = "Wrong size")
	private String name;

	@Column
	private String email;

	@Column
	private String phone;

	public Employee() {
	}

	public Employee(EmployeeID employeeID, String name, String email,
			String phone) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public EmployeeID getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(EmployeeID employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
