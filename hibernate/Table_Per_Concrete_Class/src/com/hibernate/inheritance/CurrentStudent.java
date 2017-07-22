package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "currentStudent")
public class CurrentStudent extends Student {

	@Column(name = "cemail")
	private String cemail;

	@Column(name = "cphone")
	private String cphone;

	public CurrentStudent() {

	}

	public CurrentStudent(String cname, String email, String phone,
			String cemail, String cphone) {
		super(cname, email, phone);
		this.cemail = cemail;
		this.cphone = cphone;
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
		return this.cemail + " " + this.cphone;

	}
}
