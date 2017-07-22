package com.springframework.web.controller.exceptions;

public class CustomerNotFound extends RuntimeException {
	String cid;

	public CustomerNotFound() {
		// TODO Auto-generated constructor stub
	}

	public CustomerNotFound(String cid) {
		super();
		this.cid = cid;
	}

	@Override
	public String toString() {
		String msg = "Customers Not Found";
		if (cid == null) {
			return msg;
		} else {
			return "Customer Not Found " + cid;
		}

	}

}
