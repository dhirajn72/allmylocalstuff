package com.java.persistence;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hibernate.pk.CustID;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "bid", column = @Column(name = "bid")),
			@AttributeOverride(name = "cid", column = @Column(name = "cid")) })
	private CustID id;
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

	public Customer(CustID id, String cname, String email, String phone,
			String age) {
		super();
		this.id = id;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public CustID getId() {
		return id;
	}

	public void setId(CustID id) {
		this.id = id;
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
		return id + " " + cname + " " + email + " " + phone + " " + age;
	}

}
