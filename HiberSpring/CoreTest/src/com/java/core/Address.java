package com.java.core;

public final class Address {
	private final int aid;
	private final String street;
	private final int pin;

	public Address(int aid, String street, int pin) {
		super();
		this.aid = aid;
		this.street = street;
		this.pin = pin;
	}

	public int getAid() {
		return aid;
	}

	public String getStreet() {
		return street;
	}

	public int getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return aid + " " + street + " " + pin;
	}

}
