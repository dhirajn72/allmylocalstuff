package com.hibernate.persistence.ManyToManyTest;

import java.util.HashSet;
import java.util.List;
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
@Table(name = "vehicle", catalog = "mvn006")
public class Vehicles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	private String vname;
	private String vmodel;
	private String vprice;


	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "CUST_VEH", 
	joinColumns = @JoinColumn(name = "vid"), 
	inverseJoinColumns = @JoinColumn(name = "cid")
	)
	private Set<Customers> customers = new HashSet<Customers>();

	public Vehicles() {
		// TODO Auto-generated constructor stub
	}

	public Vehicles(String vname, String vmodel, String vprice) {
		super();
		this.vname = vname;
		this.vmodel = vmodel;
		this.vprice = vprice;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVmodel() {
		return vmodel;
	}

	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	public String getVprice() {
		return vprice;
	}

	public void setVprice(String vprice) {
		this.vprice = vprice;
	}

	public Set<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return vid + " " + vname + " " + vmodel + " " + vprice;
	}

}
