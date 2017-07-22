package com.hibernate.to;

public class CustomerTO {

	private int cid;
	private String cname;
	private String email;
	private String phone;
	private int age;
	private String company;

	public CustomerTO() {
	}

	public CustomerTO(int cid, String cname, String email, String phone,
			int age, String company) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.company = company;
	}

	public CustomerTO(String cname, String email, String phone, int age,
			String company) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.company = company;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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
		// TODO Auto-generated method stub
		return this.cid + " " + this.cname + " " + this.email + " "
				+ this.phone + " " + this.age + " " + this.company;
	}
}
