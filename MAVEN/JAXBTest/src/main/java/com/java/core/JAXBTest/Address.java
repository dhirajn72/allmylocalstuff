package com.java.core.JAXBTest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
	private int aid;
	private String street;
	private String state;
	private int pin;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String street, String state, int pin) {
		super();
		this.aid = aid;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", state="
				+ state + ", pin=" + pin + "]";
	}

}
