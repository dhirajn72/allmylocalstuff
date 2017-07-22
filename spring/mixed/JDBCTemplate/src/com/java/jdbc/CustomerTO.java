package com.java.jdbc;

import java.io.Serializable;

public class CustomerTO implements Serializable{

	private String cid;
	private String cname;
	private String email;
	private String phone;
	private String dob;

	public CustomerTO() {

	}

	public CustomerTO(String sid, String sname, String email, String phone,
			String dob) {
		super();
		this.cid = sid;
		this.cname = sname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + dob;
	}

}
