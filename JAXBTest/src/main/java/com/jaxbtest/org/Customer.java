package com.jaxbtest.org;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author dhiraj
 *
 */

@XmlRootElement
public class Customer {

	private int cid;
	private String cname;
	private String email;
	private long phone;

	public int getCid() {
		return cid;
	}

	// @XmlAttribute
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	// @XmlElement
	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	// @XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	// @XmlElement
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
