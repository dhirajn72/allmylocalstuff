package com.java.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vid")
	// @Cascade(value = CascadeType.DELETE)
	private int vid;

	@Column(name = "vname")
	private String vname;

	@Column(name = "model")
	private String model;

	@Column(name = "price")
	private String price;

	@ManyToOne
	@JoinColumn(name = "cid", referencedColumnName = "cid")
	//@Cascade(value = CascadeType.ALL)
	private Customer customer;

	public Vehicle() {

	}

	public Vehicle(String vname, String model, String price) {
		super();
		this.vname = vname;
		this.model = model;
		this.price = price;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return vid + " " + vname + " " + model + " " + price + " " + customer;
	}

}
