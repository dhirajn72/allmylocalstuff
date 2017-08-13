package com.spring.soap.cxf.client;

import com.spring.soap.cxf.AccountDAO;
import com.spring.soap.cxf.AccountDAOImplService;

public class Client {

	public static void main(String[] args) {

		AccountDAOImplService service = new AccountDAOImplService();

		AccountDAO servicedDao = service.getAccountDAOImplPort();

		String message = servicedDao.deposit(100000);
		System.out.println(message);

		int res = servicedDao.requestCheckBook("Please dispatch my checkbook");
		System.out.println(res);

	}

}
