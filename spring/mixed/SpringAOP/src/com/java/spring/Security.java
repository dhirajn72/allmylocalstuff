package com.java.spring;

public class Security {

	public void verifySecurity() {
		System.out.println("Security-verifySecurity()");
	}

	public void expnHandler() {
		try {
			System.out.println("Security-expnHandler()");
		} catch (Exception e) {
			System.out.println("handled exception");
		}
	}

}
