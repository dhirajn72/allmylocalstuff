package com.hibernate.persistence;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String email;

	@ElementCollection
	@CollectionTable(name = "nos", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "idx")
	@Cascade(CascadeType.ALL)
	private String[] nos;

	@ElementCollection
	@CollectionTable(name = "phones", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "idx")
	@Cascade(CascadeType.ALL)
	private List<String> phones;

	@ElementCollection
	@CollectionTable(name = "emails", joinColumns = @JoinColumn(name = "sid"))
	@Cascade(CascadeType.ALL)
	private Set<String> emails;

	@ElementCollection(targetClass = java.lang.String.class)
	@MapKeyClass(value = java.lang.String.class)
	@MapKeyColumn(name = "map_key")
	@CollectionTable(name = "reference", joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "map_values")
	@Cascade(CascadeType.ALL)
	private Map<String, Object> refs;

	public Student() {
	}

	public Student(String sname, String email, String[] nos,
			List<String> phones, Set<String> emails, Map<String, Object> refs) {
		super();
		this.sname = sname;
		this.email = email;
		this.nos = nos;
		this.phones = phones;
		this.emails = emails;
		this.refs = refs;
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

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	public Map<String, Object> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Object> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phones + " " + emails
				+ " " + refs;
	}

}
