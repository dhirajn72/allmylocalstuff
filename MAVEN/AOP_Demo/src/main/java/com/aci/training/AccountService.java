package com.aci.training;

public class AccountService {

	public void checkBalance() {
		System.out.println("checkBalance()");
	}

	public void withdraw() {
		System.out.println("withdraw()");
		int x = 10 / 0;
	}

	public void fundTransfer() {
		System.out.println("fundTransfer()");
	}

}
