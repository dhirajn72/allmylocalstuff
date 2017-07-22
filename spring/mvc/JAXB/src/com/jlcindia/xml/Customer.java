package com.jlcindia.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private int cid;
	private String cname;
	private long phone;
	private Account account;

	public Customer() {

	}

	public Customer(int cid, String cname, long phone, Account account) {
		super();
		this.cid = cid;
		this.cname = cname;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
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
		return this.cid + " " + this.cname + " " + this.phone + " "
				+ this.account;
	}

}
