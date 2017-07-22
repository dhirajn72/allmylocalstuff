package com.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cstudent")
public class CurrentStudent extends Student {
	private String cname;
	private String cemail;
	private String cphone;

	public CurrentStudent() {
	}

	

	public CurrentStudent(String name, String cname, String cemail,
			String cphone) {
		super(name);
		this.cname = cname;
		this.cemail = cemail;
		this.cphone = cphone;
	}



	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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
		return cname + " " + cemail + " " + cphone;
	}

}
