package com.hibernate.persistence;

import com.hibernate.persistence.dao.CustomerDAO;
import com.hibernate.persistence.dao.CustomerDAOImpl;

public class CustomerDAOFactory {
	private static CustomerDAO customerDAO = null;
	static {
		customerDAO = new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

}
