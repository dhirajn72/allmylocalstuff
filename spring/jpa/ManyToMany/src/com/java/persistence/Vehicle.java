package com.java.persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle1")
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

	@ManyToMany(mappedBy = "vehicles")
	// @Cascade(value = CascadeType.ALL)
	private List<Customer> customer;

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

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return vid + " " + vname + " " + model + " " + price + " " + customer;
	}

}
