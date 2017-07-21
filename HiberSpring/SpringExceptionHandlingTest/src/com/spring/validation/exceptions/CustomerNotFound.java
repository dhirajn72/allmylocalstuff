package com.spring.validation.exceptions;

public class CustomerNotFound extends RuntimeException {

	String cid;

	public CustomerNotFound() {

	}

	public CustomerNotFound(String cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		String msg = "Customer Not Found";
		if (cid == null) {
			return msg;
		} else {
			return msg + " " + cid;
		}

	}

	@Override
	public String getMessage() {
		return toString();
	}

}
