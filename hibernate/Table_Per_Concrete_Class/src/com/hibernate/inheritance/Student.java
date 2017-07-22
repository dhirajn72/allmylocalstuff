package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student {

	@Id
	@Column(name = "cid")
	private int cid;

	@Column(name = "cname")
	private String cname;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	public Student() {

	}

	public Student(String cname, String email, String phone) {
		super();
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
		return this.cid + " " + this.cname + " " + this.email + " "
				+ this.phone;

	}
}
