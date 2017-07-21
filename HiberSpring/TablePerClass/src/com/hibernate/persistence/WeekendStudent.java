package com.hibernate.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@DiscriminatorValue(value="WSTU")
@Proxy(lazy = false)
public class WeekendStudent extends CurrentStudent {

	private String wsname;
	private String wemail;
	private String wphone;

	public WeekendStudent() {
	}

	public WeekendStudent(String sname, String email, String phone,
			String csname, String cemail, String cphone, String wsname,
			String wemail, String wphone) {
		super(sname, email, phone, csname, cemail, cphone);
		this.wsname = wsname;
		this.wemail = wemail;
		this.wphone = wphone;
	}

	public String getWsname() {
		return wsname;
	}

	public void setWsname(String wsname) {
		this.wsname = wsname;
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
		return wsname + " " + wemail + " " + wphone;
	}

}
