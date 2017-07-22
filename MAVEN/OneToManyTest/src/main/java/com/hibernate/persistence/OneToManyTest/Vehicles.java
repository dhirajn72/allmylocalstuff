package com.hibernate.persistence.OneToManyTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	private String vname;
	private String vmodel;
	private String vprice;

	@ManyToOne
	@JoinColumn(name = "cid", referencedColumnName = "cid")
	private Customer customer;

	public Vehicles() {
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return vid + " " + vname + " " + vmodel + " " + vprice + " " + customer;
	}

}
