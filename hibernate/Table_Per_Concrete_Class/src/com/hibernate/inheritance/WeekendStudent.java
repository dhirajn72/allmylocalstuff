package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "weekendStudent")
public class WeekendStudent extends CurrentStudent {

	@Column(name = "wemail")
	private String wemail;

	@Column(name = "wephone")
	private String wephone;

	public WeekendStudent() {

	}


	public WeekendStudent(String cname, String email, String phone,
			String cemail, String cphone, String wemail, String wephone) {
		super(cname, email, phone, cemail, cphone);
		this.wemail = wemail;
		this.wephone = wephone;
	}


	public String getWemail() {
		return wemail;
	}

	public void setWemail(String wemail) {
		this.wemail = wemail;
	}

	public String getWphone() {
		return wephone;
	}

	public void setWphone(String wphone) {
		this.wephone = wphone;
	}

	@Override
	public String toString() {
		return this.wemail + " " + this.wephone;
	}
}
