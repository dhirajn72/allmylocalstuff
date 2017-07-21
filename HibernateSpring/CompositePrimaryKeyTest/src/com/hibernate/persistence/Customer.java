package com.hibernate.persistence;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "bid", column = @Column(name = "bid")),
			@AttributeOverride(name = "cid", column = @Column(name = "cid")) })
	private CustID id;
	private String cname;
	private String email;

	public Customer() {
	}

	public Customer(CustID id, String cname, String email) {
		super();
		this.id = id;
		this.cname = cname;
		this.email = email;
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

	@Override
	public String toString() {
		return id + " " + cname + " " + email;
	}

}
