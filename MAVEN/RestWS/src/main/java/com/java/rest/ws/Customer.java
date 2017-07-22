package com.java.rest.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private int cid;
	private String cname;
	private String email;
	private String phone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String email, String phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
