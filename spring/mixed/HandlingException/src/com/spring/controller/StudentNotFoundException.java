/**
 * 
 */
package com.spring.controller;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class StudentNotFoundException extends RuntimeException {

	String msg;

	public StudentNotFoundException() {
	}

	public StudentNotFoundException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg + " Student Not Found";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return toString();
	}

}
