package com.java.jpa.client;

import com.java.jpa.dao.CustomerDAO;
import com.java.jpa.dao.CustomerFactory;
import com.java.jpa.to.CustomerTO;

public class Test1 {
	public static void main(String[] args) {
		CustomerDAO customerDAO = CustomerFactory.getCustomerDAO();

		CustomerTO to = new CustomerTO(101, "MK", "mk@gmail.com", "974385499");
		customerDAO.addCustomer(to);
		CustomerTO to1 = new CustomerTO(101, "dhiraj", "dhiraj@gmail.com",
				"974385499");
		customerDAO.addCustomer(to1);
		CustomerTO to2 = new CustomerTO(101, "singh", "singh@gmail.com",
				"974385499");
		customerDAO.addCustomer(to2);
		CustomerTO to3 = new CustomerTO(101, "kumar", "kumar@gmail.com",
				"974385499");
		customerDAO.addCustomer(to3);

	}
}
