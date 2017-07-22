package com.hibernate.client;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.daoFactory.CustomerDAOFactory;
import com.hibernate.to.CustomerTO;

public class TestA {

	public static void main(String[] args) {

		CustomerDAO dao = CustomerDAOFactory.getCustomerDAO();

		// Adding the customer
		CustomerTO customerTO = new CustomerTO("ranjan", "ranjan@gmail.com",
				"9743855599",27, "facebook");
		dao.addCustomer(customerTO);

	}

}
