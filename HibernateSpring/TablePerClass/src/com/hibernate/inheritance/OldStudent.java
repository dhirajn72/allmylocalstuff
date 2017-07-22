package com.hibernate.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "OSTU")
public class OldStudent extends Student {
	private String oname;
	private String oemail;
	private String ophone;

	public OldStudent() {
	}

	

	public OldStudent(String name, String oname, String oemail, String ophone) {
		super(name);
		this.oname = oname;
		this.oemail = oemail;
		this.ophone = ophone;
	}



	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
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
		return oname + " " + oemail + "  " + ophone;
	}

}
