package com.java.jpa.tableperconcreteclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student {
	@Id
	@Column(name = "sid")
	private int sid;

	@Column(name = "sname")
	private String sname;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	public Student() {

	}

	public Student(String cname, String email, String phone) {
		super();
		this.sname = cname;
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
