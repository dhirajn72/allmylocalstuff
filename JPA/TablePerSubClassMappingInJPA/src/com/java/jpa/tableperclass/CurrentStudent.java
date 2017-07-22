package com.java.jpa.tableperclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "CSTU")
public class CurrentStudent extends Student {
	@Column(name = "cemail")
	private String cemail;
	@Column(name = "cphone")
	private String cphone;

	public CurrentStudent() {
		// TODO Auto-generated constructor stub
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
		return super.toString() + " " + cemail + " " + cphone;
	}

}
