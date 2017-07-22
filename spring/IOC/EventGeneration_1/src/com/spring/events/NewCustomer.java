package com.spring.events;

public class NewCustomer {

	private int cid;
	private String cname;
	private String email;
	private String phone;

	public NewCustomer() {
		// TODO Auto-generated constructor stub
	}

	public NewCustomer(int cid, String cname, String email, String phone) {
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
		// TODO Auto-generated method stub
		return this.cid + " " + this.cname + " " + this.email + " "
				+ this.phone;
	}

}
