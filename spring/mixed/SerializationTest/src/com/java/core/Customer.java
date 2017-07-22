package com.java.core;

import java.io.Serializable;

public class Customer implements Serializable {

	private int cid;
	private String cname;
	private String email;
	private long phone;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
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

	public  long getPhone() {
		return phone;
	}

	public void setPhone( long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone;
	}

}
