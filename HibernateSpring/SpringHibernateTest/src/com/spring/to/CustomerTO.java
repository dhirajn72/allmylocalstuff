package com.spring.to;

public class CustomerTO {
	private int cid;
	private String cname;
	private String email;
	private String phone;
	private String age;
	private String company;
	private String city;

	public CustomerTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerTO(String cname, String email, String phone, String age,
			String company, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.company = company;
		this.city = city;
	}

	public CustomerTO(int cid, String cname, String email, String phone,
			String age, String company, String city) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.company = company;
		this.city = city;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + age + " "
				+ company;
	}

}
