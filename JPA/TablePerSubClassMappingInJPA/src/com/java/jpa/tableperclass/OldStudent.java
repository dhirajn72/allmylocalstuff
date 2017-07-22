package com.java.jpa.tableperclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "OSTU")
public class OldStudent extends Student {
	@Column(name = "oemail")
	private String oemail;
	@Column(name = "ophone")
	private String ophone;

	public OldStudent() {

	}

	public OldStudent(String cname, String email, String phone, String oemail,
			String ophone) {
		super(cname, email, phone);
		this.oemail = oemail;
		this.ophone = ophone;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}

	public String getOphone() {
		return ophone;
	}

	public void setOphone(String ophone) {
		this.ophone = ophone;
	}

	@Override
	public String toString() {
		return oemail + " " + ophone;
	}

}
