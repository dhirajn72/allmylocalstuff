package com.java.jpa.tableperconcreteclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="WSTUDENT")
public class WeekendStudent extends CurrentStudent {
	@Column(name = "wemail")
	private String wemail;

	@Column(name = "wphone")
	private String wphone;

	public WeekendStudent() {
		// TODO Auto-generated constructor stub
	}

	public WeekendStudent(String cname, String email, String phone,
			String cemail, String cphone, String wemail, String wphone) {
		super(cname, email, phone, cemail, cphone);
		this.wemail = wemail;
		this.wphone = wphone;
	}

	public String getWemail() {
		return wemail;
	}

	public void setWemail(String wemail) {
		this.wemail = wemail;
	}

	public String getWphone() {
		return wphone;
	}

	public void setWphone(String wphone) {
		this.wphone = wphone;
	}

	@Override
	public String toString() {
		return toString() + " " + wemail + " " + wphone;
	}

}
