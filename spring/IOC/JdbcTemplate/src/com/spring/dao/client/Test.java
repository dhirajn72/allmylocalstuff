package com.spring.dao.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.CIDGenerator;
import com.spring.dao.CustomerDAO;
import com.spring.dao.CustomerTO;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDaoImpl");

		// adding customer

		/*
		 * CustomerTO to = new CustomerTO(CIDGenerator.getNextCID(), "Singh",
		 * "singh@gmail.com", "9743854499", "bangalore", 24);
		 * customerDAO.addCustomer(to);
		 */
		// deleteing customer
		// customerDAO.deleteCustomer(7);
		// update customer

		/*
		 * CustomerTO to = new CustomerTO(9, "kumar", "kumar@gmail.com",
		 * "666666666", "chennai", 23); customerDAO.updateCustomer(to);
		 */

		// get All Customers

		/*
		 * List<CustomerTO> tos = customerDAO.getAllCustomer(); for (CustomerTO
		 * to : tos) { System.out.println(to); }
		 * System.out.println("**************");
		 */

		List<CustomerTO> tos = customerDAO.getAllCustomerByCity("bangalore");
		for (CustomerTO to : tos) {
			System.out.println(to);
		}

		System.out.println("*************");

	}

}
