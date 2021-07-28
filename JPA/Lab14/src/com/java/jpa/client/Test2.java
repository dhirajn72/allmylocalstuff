package com.java.jpa.client;

import com.java.jpa.dao.CustomerDAO;
import com.java.jpa.dao.CustomerFactory;
import com.java.jpa.to.CustomerTO;

public class Test2 {

	public static void main(String[] args) {

		CustomerDAO customerDAO = CustomerFactory.getCustomerDAO();
		// customerDAO.removeCustomer(4);

		CustomerTO customerTO = new CustomerTO(2, "SRI", "sri@yahoo.com",
				"12345");
		// customerDAO.mergeCustomer(customerTO);

		CustomerTO to = customerDAO.getCustomerByCid(5);
		System.out.println(to);

	}

}
