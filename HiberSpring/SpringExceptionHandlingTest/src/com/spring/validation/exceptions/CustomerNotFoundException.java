package com.spring.validation.exceptions;

public class CustomerNotFoundException extends RuntimeException {

	String cid;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String cid) {
		super();
		this.cid = cid;
	}

	@Override
	public String toString() {
		String str = "Customer not found";
		if (cid == null) {
			return str;
		} else {
			return str + " " + cid;
		}
	}

}
