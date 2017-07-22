package com.springframework.web.controller.exceptions;

public class CustomerNotAvailable extends RuntimeException {
	String cid;

	public CustomerNotAvailable() {
		// TODO Auto-generated constructor stub
	}

	public CustomerNotAvailable(String cid) {
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
