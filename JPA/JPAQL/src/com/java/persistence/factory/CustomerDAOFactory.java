package com.java.persistence.factory;

import com.java.persistence.dao.CustomerDAO;
import com.java.persistence.dao.CustomerDAOImpl;

public class CustomerDAOFactory {

	private static CustomerDAO customerDAO;
	static {
		customerDAO = new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

}
