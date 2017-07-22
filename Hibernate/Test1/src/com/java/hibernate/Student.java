package com.java.hibernate;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int sid;

	@Column(name = "sname")
	private String sname;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@CollectionOfElements
	@JoinTable(name = "emails", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	@Column(name = "email")
	private List<String> emails;

	@CollectionOfElements
	@JoinTable(name = "phones", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	@Column(name = "phone")
	private Set<String> phones;

	public Student() {

	}

	public Student(String sname, String email, String phone,
			List<String> emails, Set<String> phones) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.emails = emails;
		this.phones = phones;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone + " " + emails
				+ " " + phones;
	}

}
