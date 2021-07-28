package com.java.persistence.client;

import com.java.persistence.dao.CustomerDAO;
import com.java.persistence.factory.CustomerDAOFactory;
import com.java.persistence.to.CustomerTO;

public class Test1 {

	public static void main(String[] args) {

		CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();

		CustomerTO customerTO = new CustomerTO("chotu", "chotu@gmail.com",
				"12345", "bokaro");

		CustomerTO customerTO1 = new CustomerTO("dk", "dk@gmail.com",
				"12345", "ranchi");

		CustomerTO customerTO2 = new CustomerTO("ashish", "ashish@gmail.com",
				"12345", "bokaro");

		CustomerTO customerTO3 = new CustomerTO("shekhar", "shekhar@gmail.com",
				"12345", "rajasthan");

		CustomerTO customerTO4 = new CustomerTO("ranjan", "rabjan@gmail.com",
				"12345", "bihar");

		CustomerTO customerTO5 = new CustomerTO("rahul", "rahul@gmail.com",
				"12345", "gaya");

		CustomerTO customerTO6 = new CustomerTO("MK", "mk@gmail.com",
				"12345", "bokaro");

		CustomerTO customerTO7 = new CustomerTO("SK", "sk@gmail.com",
				"12345", "bokaro");

		CustomerTO customerTO8 = new CustomerTO("rj", "rj@gmail.com",
				"12345", "bokaro");

		CustomerTO customerTO9 = new CustomerTO("sri", "sri@gmail.com",
				"12345", "bokaro");

		CustomerTO customerTO10 = new CustomerTO("nivas", "nivas@gmail.com",
				"12345", "bokaro");

		customerDAO.addCustomer(customerTO);
		customerDAO.addCustomer(customerTO1);
		customerDAO.addCustomer(customerTO2);
		customerDAO.addCustomer(customerTO3);
		customerDAO.addCustomer(customerTO4);
		customerDAO.addCustomer(customerTO5);
		customerDAO.addCustomer(customerTO6);
		customerDAO.addCustomer(customerTO7);
		customerDAO.addCustomer(customerTO8);
		customerDAO.addCustomer(customerTO9);
		customerDAO.addCustomer(customerTO10);

	}

}
