package com.java.persistence.to;

public class CustomerTO {
	private int cid;
	private String cname;
	private String email;
	private String phone;
	private String city;

	public CustomerTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerTO(int cid, String cname, String email, String phone,
			String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public CustomerTO(String cname, String email, String phone, String city) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + city;
	}

}
