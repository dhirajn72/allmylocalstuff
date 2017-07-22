package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "oldStudent")
@PrimaryKeyJoinColumn(name = "cid")
public class OldStudent extends Student {

	@Column(name = "")
	private int oid;

	@Column(name = "")
	private String oemail;

	@Column(name = "")
	private String ophone;

	public OldStudent() {

	}

	public OldStudent(String cname, String email, String phone, String oemail,
			String ophone) {
		super(cname, email, phone);
		this.oemail = oemail;
		this.ophone = ophone;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
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
		return this.oid + " " + this.oemail + " " + this.ophone;
	}

}
