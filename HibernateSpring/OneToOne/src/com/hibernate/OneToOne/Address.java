package com.hibernate.OneToOne;

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
	private int houseNo;
	private String street;
	private int pinCode;
	private String state;

	@OneToOne
	@JoinColumn(name = "houseNo")
	@Cascade(value = CascadeType.ALL)
	private Customer customer;

	public Address() {
	}

	public Address(String street, int pinCode, String state) {
		super();
		this.street = street;
		this.pinCode = pinCode;
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street
				+ ", pinCode=" + pinCode + ", state=" + state + "]";
	}

}
