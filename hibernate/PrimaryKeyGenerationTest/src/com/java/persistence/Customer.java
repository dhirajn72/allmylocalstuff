package com.java.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	private String cid;
	private String cname;
	private String email;
	private String phone;
	private String age;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cname, String email, String phone, String age) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public Customer(String cid, String cname, String email, String phone,
			String age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + age;
	}

}
