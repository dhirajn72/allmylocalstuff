package com.aci.training;

public class Transaction {

	public void transactionBegins() {
		System.out.println("transactionBegins()");
	}

	public void transactionCommit() {
		System.out.println("transactionCommit()");
	}

	public void transactionRollback() {
		System.out.println("transactionRollback()");
	}

}
