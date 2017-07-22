package com.hibernate.persistence.OneToOneTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String street;
	private String state;
	private String pin;

	@OneToOne
	@JoinColumn(name = "aid")
	private Customer customer;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String state, String pin) {
		super();
		this.street = street;
		this.state = state;
		this.pin = pin;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return aid + " " + street + " " + state + " " + pin;

	}

}
