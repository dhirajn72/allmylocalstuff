package com.java.test.singleton;

import java.io.Serializable;

public class Student implements Serializable {
	private int sid;
	public static String sname="abcd";
	private  transient String email;
	private long phone;

	public Student() {
		System.out.println("DC");
	}

	public Student(int sid,String email, long phone) {
		super();
		this.sid = sid;
		//this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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
	public String toString() {
		return "Student [Sid=" + sid + " sname=" + sname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
