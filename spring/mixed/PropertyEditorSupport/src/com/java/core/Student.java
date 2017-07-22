package com.java.core;

import java.util.List;

public class Student {

	private SID sid;
	private String sname;
	private String email;
	private String phone;

	List<String> Phones;
	List<String> emails;

	public Student() {

	}

	public Student(String sname, String email, String phone,
			List<String> phones, List<String> emails) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		Phones = phones;
		this.emails = emails;
	}

	public SID getSid() {
		return sid;
	}

	public void setSid(SID sid) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getPhones() {
		return Phones;
	}

	public void setPhones(List<String> phones) {
		Phones = phones;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return sid.getBid()+sid.getSid()+" "+ sname + " " + email + " " + phone + " " + Phones + " " + emails;
	}

}
