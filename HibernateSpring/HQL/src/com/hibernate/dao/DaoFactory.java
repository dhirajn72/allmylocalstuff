package com.hibernate.dao;

public class DaoFactory {
	private static CustomerDAO dao;
	static {
		dao = new CustomerDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {
		return dao;
	}

}
