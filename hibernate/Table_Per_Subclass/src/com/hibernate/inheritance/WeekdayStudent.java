package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "weekdayStudent")
@PrimaryKeyJoinColumn(name = "cid")
public class WeekdayStudent extends CurrentStudent {

	@Column(name = "wemail")
	private String wemail;

	@Column(name = "wphone")
	private String wphone;

	public WeekdayStudent() {

	}

	public WeekdayStudent(String cname, String email, String phone,
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
		return this.wemail + " " + this.wphone;
	}
}
