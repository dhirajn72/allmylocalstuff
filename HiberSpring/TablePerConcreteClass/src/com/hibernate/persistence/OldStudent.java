package com.hibernate.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "ostudent")
@Proxy(lazy = false)
public class OldStudent extends Student {

	private String osname;
	private String oemail;
	private String ophone;

	public OldStudent() {
	}

	public OldStudent(String sname, String email, String phone, String osname,
			String oemail, String ophone) {
		super(sname, email, phone);
		this.osname = osname;
		this.oemail = oemail;
		this.ophone = ophone;
	}

	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
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
		return osname + " " + oemail + " " + ophone;
	}

}
