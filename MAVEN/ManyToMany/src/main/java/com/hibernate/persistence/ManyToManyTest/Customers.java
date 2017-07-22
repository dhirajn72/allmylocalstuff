package com.hibernate.persistence.ManyToManyTest;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String email;
	private String phone;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CUST_VEH", joinColumns = @JoinColumn(name = "cid", referencedColumnName = "cid"), inverseJoinColumns = @JoinColumn(name = "vid", referencedColumnName = "vid"))
	private Set<Vehicles> vehicles;

	public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(String cname, String email, String phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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

	public Set<Vehicles> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicles> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone;
	}

}
