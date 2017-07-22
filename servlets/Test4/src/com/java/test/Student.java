package com.java.test;

public class Student {
	private String sid;
	private String sname;
	private String email;
	private long phone;
	private int age;

	public Student() {

	}

	public Student(String sid, String sname, String email, long phone, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone + " " + age;
	}

}
