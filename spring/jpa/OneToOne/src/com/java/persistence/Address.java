package com.java.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aid")
	// @Cascade(value = CascadeType.DELETE)
	private int aid;

	@Column(name = "street")
	private String street;

	@Column(name = "pin")
	private long pin;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@OneToOne
	@JoinColumn(name = "aid")
	private Customer customer;

	public Address() {

	}

	public Address(String street, long pin, String state, String country) {
		super();
		this.street = street;
		this.pin = pin;
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

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return aid + " " + street + " " + pin + " " + state + " " + country
				+ " " + customer;
	}

}
