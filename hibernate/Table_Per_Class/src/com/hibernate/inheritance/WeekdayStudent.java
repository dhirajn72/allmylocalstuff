package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="WSTU")
public class WeekdayStudent extends CurrentStudent {

	@Column(name = "wmail")
	private String wmail;

	@Column(name = "wphone")
	private String wphone;

	public WeekdayStudent() {

	}

	public WeekdayStudent(String cname, String email, String phone,
			String cemail, String cphone, String wemail, String wphone) {
		super(cname, email, phone, cemail, cphone);
		this.wmail = wemail;
		this.wphone = wphone;
	}

	public String getWemail() {
		return wmail;
	}

	public void setWemail(String wemail) {
		this.wmail = wemail;
	}

	public String getWphone() {
		return wphone;
	}

	public void setWphone(String wphone) {
		this.wphone = wphone;
	}

	@Override
	public String toString() {
		return this.wmail + " " + this.wphone;
	}
}
