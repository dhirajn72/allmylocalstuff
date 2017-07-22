package com.spring.exceptions;

public class CustomerNotAvailableException extends RuntimeException {
	String cid;

	public CustomerNotAvailableException() {
		// TODO Auto-generated constructor stub
	}

	public CustomerNotAvailableException(String cid) {
		super();
		this.cid = cid;

	}

	@Override
	public String toString() {
		String msg = "Customer Not Found ";
		if (cid == null) {
			return msg;
		} else {
			return msg + cid;
		}
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return toString();
	}

}
