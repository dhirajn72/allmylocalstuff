package com.java.test;

public class EqualsHashCodeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(99, "mubarak");
		Employee e2 = new Employee(99, "mubarak");
		//Employee e2 = new Employee(88, "dhiraj");

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}

class Employee {

	int eid;
	String ename;

	public Employee() {
	}

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
		return eid + " " + ename;
	}

	@Override
	public int hashCode() {
		return 1234;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {

			Employee employee = (Employee) obj;
			return this.eid == employee.eid
					&& this.ename.equals(employee.ename);
		}
		return false;
	}
}
