package com.hibernate.collection;

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
import javax.persistence.JoinTable;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "test")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;

	@ElementCollection
	// @JoinTable(name = "emails_table", joinColumns = @JoinColumn(name =
	// "cid"))
	// @IndexColumn(name = "idx")
	@CollectionTable(name = "emails_table", joinColumns = @JoinColumn(name = "cid"))
	@Column(name = "emails")
	private List<String> emails;

	// @CollectionOfElements
	@ElementCollection
	// @JoinTable(name = "phones_table", joinColumns = @JoinColumn(name =
	// "cid"))
	// @IndexColumn(name = "idx")
	@CollectionTable(name = "phones_table", joinColumns = @JoinColumn(name = "cid"))
	@Column(name = "phones")
	private Set<String> phones;

	// @CollectionOfElements
	@ElementCollection
	// @JoinTable(name = "refs_table", joinColumns = @JoinColumn(name = "cid"))
	@CollectionTable(name = "refs_table", joinColumns = @JoinColumn(name = "cid"))
	@IndexColumn(name = "key")
	// @Column(name = "refs")
	private Map<String, String> refs;

	public Customer() {
	}

	public Customer(int cid, String cname, List<String> emails,
			Set<String> phones, Map<String, String> refs) {
		super();
		this.cid = cid;
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

	public Map<String, String> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", emails="
				+ emails + ", phones=" + phones + ", refs=" + refs + "]";
	}

}
