package com.hibernate.core;

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
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;

	@ElementCollection
	@CollectionTable(name = "emails", joinColumns = @JoinColumn(name = "cid"))
	@Fetch(FetchMode.JOIN)
	private List<String> emails;

	@ElementCollection
	@CollectionTable(name = "phones", joinColumns = @JoinColumn(name = "cid"))
	@Fetch(FetchMode.JOIN)
	private Set<String> phones;

	@ElementCollection(targetClass = java.lang.String.class)
	@MapKeyClass(java.lang.String.class)
	@MapKeyColumn(name = "map_key")
	@CollectionTable(name = "map_data", joinColumns = @JoinColumn(name = "cid"))
	@Column(name = "map_value")
	@Fetch(FetchMode.JOIN)
	private Map<String, Object> refs;

	public Customer() {
	}

	public Customer(String cname, List<String> emails, Set<String> phones,
			Map<String, Object> refs) {
		super();
		this.cname = cname;
		this.emails = emails;
		this.phones = phones;
		this.refs = refs;
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

	public Map<String, Object> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Object> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", emails="
				+ emails + ", phones=" + phones + ", refs=" + refs + "]";
	}

}
