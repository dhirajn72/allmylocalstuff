package com.jlcindia.jaxb2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String cid;
	private String cname;
	private String email;
	private Account account;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cid, String cname, String email, Account account) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.account = account;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + account;
	}

}
