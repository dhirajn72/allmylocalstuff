package com.hibernate.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	private String vname;
	private String vmodel;

	@ManyToOne
	@JoinColumn(name = "cid", referencedColumnName = "cid")
	private Customer customer;

	public Vehicle() {
	}

	public Vehicle(String vname, String vmodel) {
		super();
		this.vname = vname;
		this.vmodel = vmodel;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return vid + " " + vname + " " + vmodel;
	}

}
