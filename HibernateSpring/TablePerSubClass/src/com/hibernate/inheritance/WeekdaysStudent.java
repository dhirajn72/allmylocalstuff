package com.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "wstudent")
@PrimaryKeyJoinColumn(name = "sid")
public class WeekdaysStudent extends CurrentStudent {
	private String wname;
	private String wemail;
	private String wphone;

	public WeekdaysStudent() {
	}

	

	public WeekdaysStudent(String name, String cname, String cemail,
			String cphone, String wname, String wemail, String wphone) {
		super(name, cname, cemail, cphone);
		this.wname = wname;
		this.wemail = wemail;
		this.wphone = wphone;
	}



	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
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
		return wname + " " + wemail + " " + wphone;
	}

}
