package com.spring.soap.cxf;

import javax.jws.WebService;

@WebService
public interface AccountDAO {

	String deposit(long ammount);

	int requestCheckBook(String message);

}