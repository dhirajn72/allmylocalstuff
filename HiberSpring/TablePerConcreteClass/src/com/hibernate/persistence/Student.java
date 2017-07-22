package com.hibernate.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "student")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Proxy(lazy = false)
public class Student {
	@Id
	private int sid;
	private String sname;
	private String email;
	private String phone;

	public Student() {
	}

	public Student(String sname, String email, String phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
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
		return sid + " " + sname + " " + email + " " + phone;
	}

}
