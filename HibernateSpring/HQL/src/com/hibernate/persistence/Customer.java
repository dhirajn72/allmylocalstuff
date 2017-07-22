package com.hibernate.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "customer")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String email;
	private String phone;
	private int age;
	private double sallary;
	private String ctype;
	private String city;
	private String state;

	public Customer() {
	}

	public Customer(String cname, String email, String phone, int age,
			double sallary, String ctype, String city, String state) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.sallary = sallary;
		this.ctype = ctype;
		this.city = city;
		this.state = state;
	}

	public int getCid() {
		return cid;
	}

	/*
	 * public void setCid(int cid) { this.cid = cid; }
	 */

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
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

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone + " " + age + " "
				+ sallary + " " + city + " " + state;
	}

}
