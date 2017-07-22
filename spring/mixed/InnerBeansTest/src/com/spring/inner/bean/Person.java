/**
 * 
 */
package com.spring.inner.bean;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Person {

	private int pid;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	class Student {
		String sname;

		public Student() {
			// TODO Auto-generated constructor stub
		}

		public void m1() {
			System.out.println(sname);
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

	}

	class Employee {
		String ename;

		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public void m1() {
			System.out.println(ename);
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

}
