package com.java.jpa.dao;

public class CustomerFactory {
	private static CustomerDAO dao;
	static {
		dao = new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {
		return dao;
	}

}
