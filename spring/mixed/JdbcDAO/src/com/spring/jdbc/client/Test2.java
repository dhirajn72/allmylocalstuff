package com.spring.jdbc.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.CustomerDAO;
import com.spring.jdbc.dao.CustomerTO;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDAO");
		// customerDAO.deleteCustomer(113);
		CustomerTO customerTO = new CustomerTO(107, null, "lohar@yahoo.com",
				Long.parseLong("12345"), null);
		// customerDAO.updateCustomer(customerTO);

		List<CustomerTO> list = customerDAO.getAllCustomers();
		for (CustomerTO to : list) {
			System.out.println(to);
		}

		CustomerTO cto = customerDAO.getCustomerByCid(102);
		// System.out.println(cto);

		/*
		 * List<CustomerTO> list = customerDAO.getCustomerByCity("Bokaro"); for
		 * (CustomerTO to : list) { System.out.println(to); }
		 */
		CustomerTO cto2 = customerDAO.getCustomerByEmail("raj@gmail.com");
		System.out.println(cto2);

	}
}
