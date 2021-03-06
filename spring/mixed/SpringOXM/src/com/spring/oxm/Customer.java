package com.spring.oxm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private int cid;
	private String cname;
	private String email;
	private String phone;
	private Account account;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String email, String phone,
			Account account) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.account = account;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + account;
	}

}
