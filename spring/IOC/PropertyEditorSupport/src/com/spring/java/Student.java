package com.spring.java;

import java.util.List;

public class Student {
	private StudentID sid;
	private String sname;
	private String email;
	private String phone;
	private Fee fee;

	private List<String> emails;

	public StudentID getSid() {
		return sid;
	}

	public void setSid(StudentID sid) {
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

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return this.sid.getSid() + " " + this.sid.getBid() + " " + this.sname
				+ " " + this.email + " " + this.phone + " "
				+ this.fee.getTotalFee() + " " + this.fee.getFeePaid() + " "
				+ this.fee.getFeeBal();
	}

}
