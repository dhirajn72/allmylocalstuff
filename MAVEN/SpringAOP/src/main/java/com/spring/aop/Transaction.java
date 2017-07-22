package com.spring.aop;

public class Transaction {

	public void beginTransaction() {
		System.out.println("beginTransaction-beginTransaction()");
	}

	public void commitTransaction() {
		System.out.println("beginTransaction-commitTransaction()");
	}

	public void rollbackTransaction() {
		System.out.println("beginTransaction-rollbackTransaction()");
	}

}
