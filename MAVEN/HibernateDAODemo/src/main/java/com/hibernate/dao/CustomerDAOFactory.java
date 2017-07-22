package com.hibernate.dao;

import com.hibernate.persistence.CustomerDAOImpl;

public class CustomerDAOFactory {
	private static final CustomerDAO CUSTOMER_DAO;
	static {
		CUSTOMER_DAO = new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {
		return CUSTOMER_DAO;
	}

}
