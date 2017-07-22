package com.hibernate.to;

public class CustomerTO {
	private String cid;
	private String cname;
	private String email;
	private String phone;
	private String age;
	private String city;
	private double sallary;
	private String ctype;

	public CustomerTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerTO(String cname, String email, String phone, String age,
			String city, double sallary, String ctype) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.sallary = sallary;
		this.ctype = ctype;
	}

	public CustomerTO(String cid, String cname, String email, String phone,
			String age, String city, double sallary, String ctype) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.sallary = sallary;
		this.ctype = ctype;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + age + " "
				+ city + " " + sallary + " " + ctype;
	}

}
