package com.spring.exception;

public class CustomerNotFoundException extends RuntimeException {

	int cid;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(int email) {
		this.cid = email;
	}

	@Override
	public String toString() {
		String msg = "Customer Not Found ";
		return msg + cid;

	}

	@Override
	public String getMessage() {
		return toString();
	}

}
