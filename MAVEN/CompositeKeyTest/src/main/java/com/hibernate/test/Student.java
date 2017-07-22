package com.hibernate.test;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "bid", column = @Column(name = "bid")),
			@AttributeOverride(name = "sid", column = @Column(name = "sid")) })
	private SID sid;
	private String sname;
	private String email;
	private String phone;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(SID sid, String sname, String email, String phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public SID getSid() {
		return sid;
	}

	public void setSid(SID sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
