package com.java.test.generics;

public class Test1 {
	public static void main(String[] args) {
		Employee<Integer,String,Long> employee= new Employee<Integer,String,Long>();
		employee.setEmployeeId(99);
		employee.setEmployeeName("Dhiraj");
		employee.setEmployeePhone(9868898l);
		
		System.out.println(employee);
		
		
		

	}
}

class Employee<I, N, P> {
	private I employeeId;
	private N employeeName;
	private P employeePhone;

	public I getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(I employeeId) {
		this.employeeId = employeeId;
	}

	public N getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(N employeeName) {
		this.employeeName = employeeName;
	}

	public P getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(P employeePhone) {
		this.employeePhone = employeePhone;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeePhone=" + employeePhone + "]";
	}

}
