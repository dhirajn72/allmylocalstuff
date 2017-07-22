package com.java.spring;

public class AccountService {

	public void deposite() {
		System.out.println("deposite()-begins");
		System.out.println("deposite()-ends");
		//throw new RuntimeException("exception-from deposite()");

	}

	public void withdraw() {
		System.out.println("withdraw()-begins");
		System.out.println("withdraw()-ends");

	}

	public void balanceCheck() {
		System.out.println("balanceCheck()-begins");
		System.out.println("balanceCheck()-ends");

	}

}
