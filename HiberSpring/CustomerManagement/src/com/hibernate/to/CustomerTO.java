package com.hibernate.to;

public class CustomerTO {
	private int cid;
	private String cname;
	private String email;
	private String phone;
	private int age;

	public CustomerTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerTO(int cid, String cname, String email, String phone, int age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public CustomerTO(String cname, String email, String phone, int age) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
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

	@Override
	public String toString() {
		return "CustomerTO [cid=" + cid + ", cname=" + cname + ", email="
				+ email + ", phone=" + phone + ", age=" + age + "]";
	}

}
