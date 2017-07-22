package com.hibernate.daoFactory;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.dao.CustomerDAOImpl;

public class CustomerDAOFactory {

	private static CustomerDAO customerDAO;
	static {
		customerDAO = new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

}
