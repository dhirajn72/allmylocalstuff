package com.java.jpa.tableperconcreteclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="WDSTUDENT")
public class WeekdayStudent extends CurrentStudent {
	@Column(name = "wdemail")
	private String wdemail;

	@Column(name = "wdphone")
	private String wdphone;

	public WeekdayStudent() {
		// TODO Auto-generated constructor stub
	}

	public WeekdayStudent(String cname, String email, String phone,
			String cemail, String cphone, String wdemail, String wdphone) {
		super(cname, email, phone, cemail, cphone);
		this.wdemail = wdemail;
		this.wdphone = wdphone;
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
		return super.toString() + " " + wdemail + " " + wdphone;
	}

}
