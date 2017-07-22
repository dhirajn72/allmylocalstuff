package com.java.jpa.peristence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vid")
	private int vid;

	@Column(name = "vname")
	private String vname;

	@Column(name = "vmodel")
	private String vmodel;

	@Column(name = "vprice")
	private double vprice;

	@ManyToOne
	@JoinColumn(name = "cid")
	private Customer customer;

	public Vehicle() {

	}

	public Vehicle(String vname, String vmodel, double vprice) {
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

	public double getVprice() {
		return vprice;
	}

	public void setVprice(double vprice) {
		this.vprice = vprice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return vid + " " + vname + " " + vmodel + " " + vprice;
	}

}
