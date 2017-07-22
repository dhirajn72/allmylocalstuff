package com.hibernate.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "wdstudent")
@Proxy(lazy = false)
public class WeekDaysStudent extends CurrentStudent {

	private String wdsname;
	private String wdemail;
	private String wdphone;

	public WeekDaysStudent() {
	}

	public WeekDaysStudent(String sname, String email, String phone,
			String csname, String cemail, String cphone, String wdsname,
			String wdemail, String wdphone) {
		super(sname, email, phone, csname, cemail, cphone);
		this.wdsname = wdsname;
		this.wdemail = wdemail;
		this.wdphone = wdphone;
	}

	public String getWdsname() {
		return wdsname;
	}

	public void setWdsname(String wdsname) {
		this.wdsname = wdsname;
	}

	public String getWdemail() {
		return wdemail;
	}

	public void setWdemail(String wdemail) {
		this.wdemail = wdemail;
	}

	public String getWdphone() {
		return wdphone;
	}

	public void setWdphone(String wdphone) {
		this.wdphone = wdphone;
	}

	@Override
	public String toString() {
		return wdsname + " " + wdemail + " " + wdphone;
	}

}
