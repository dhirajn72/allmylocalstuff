package com.java.jpa.peristence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aid")
	private int aid;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String state, String country) {
		super();
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return aid + " " + street + " " + state + " " + country;
	}

}
