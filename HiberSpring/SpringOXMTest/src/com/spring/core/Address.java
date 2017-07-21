package com.spring.core;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	private String houseNo;
	private String street;
	private String state;
	private int pin;

	public Address() {
	}

	public Address(String houseNo, String street, String state, int pin) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.state = state;
		this.pin = pin;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street
				+ ", state=" + state + ", pin=" + pin + "]";
	}

}
