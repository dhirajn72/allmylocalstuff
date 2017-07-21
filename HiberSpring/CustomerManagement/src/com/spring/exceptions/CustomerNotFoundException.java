package com.spring.exceptions;

public class CustomerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String cid;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String cid) {
		super();
		this.cid = cid;
	}

	@Override
	public String toString() {
		String msg = "Customer Not Found ";
		if (cid == null) {
			return msg;
		} else
			return msg + cid;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return toString();
	}

}
