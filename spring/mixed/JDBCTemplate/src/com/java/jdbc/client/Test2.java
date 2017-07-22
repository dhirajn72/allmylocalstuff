package com.java.jdbc.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.jdbc.CustomerTO;
import com.java.jdbc.dao.CustomerDAO;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDao");
		// customerDAO.deleteCustomer("HCL-006");
		CustomerTO customerTO = new CustomerTO("HCL-003", "Ranjan",
				"ranjan@gmail.com", "888888", "10/5/1990");
		// customerDAO.updateCustomer(customerTO);

		// CustomerTO customerTO2 = customerDAO.getCustomerByCid("HCL-005");
		// System.out.println(customerTO2);
		/*
		 * List<CustomerTO> tos = customerDAO.getAllCustomers(); for (CustomerTO
		 * to : tos) { System.out.println(to); }
		 */

		CustomerTO customerTO2 = customerDAO
				.getCustomerByEmail("sri@gmail.com");
		System.out.println(customerTO2);

	}
}
