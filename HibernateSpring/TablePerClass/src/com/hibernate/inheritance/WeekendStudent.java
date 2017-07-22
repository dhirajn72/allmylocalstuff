package com.hibernate.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "WNSTU")
public class WeekendStudent extends CurrentStudent {
	private String wnname;
	private String wnemail;
	private String wephone;

	public WeekendStudent() {
	}

	public WeekendStudent(String name, String cname, String cemail,
			String cphone, String wnname, String wnemail, String wephone) {
		super(name, cname, cemail, cphone);
		this.wnname = wnname;
		this.wnemail = wnemail;
		this.wephone = wephone;
	}

	public String getWnname() {
		return wnname;
	}

	public void setWnname(String wnname) {
		this.wnname = wnname;
	}

	public String getWnemail() {
		return wnemail;
	}

	public void setWnemail(String wnemail) {
		this.wnemail = wnemail;
	}

	public String getWephone() {
		return wephone;
	}

	public void setWephone(String wephone) {
		this.wephone = wephone;
	}

	@Override
	public String toString() {
		return wnname + " " + wnemail + " " + wephone;
	}

}
