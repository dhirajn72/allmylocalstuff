package com.hibernate.persistence;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "cstudent")
@PrimaryKeyJoinColumn(name = "sid")
@Proxy(lazy=false)
public class CurrentStudent extends Student {

	private String csname;
	private String cemail;
	private String cphone;

	public CurrentStudent() {
	}

	public CurrentStudent(String sname, String email, String phone,
			String csname, String cemail, String cphone) {
		super(sname, email, phone);
		this.csname = csname;
		this.cemail = cemail;
		this.cphone = cphone;
	}

	public String getCsname() {
		return csname;
	}

	public void setCsname(String csname) {
		this.csname = csname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	@Override
	public String toString() {
		return csname + " " + cemail + " " + cphone;
	}

}
