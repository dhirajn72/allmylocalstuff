package com.spring.jpaTemplate;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jpaTemp.CustomerDAO;
import com.spring.jpaTemp.CustomerTO;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDao");

		/*
		 * CustomerTO to = new CustomerTO("DHIRAJ", "dhiraj@yahoo.com",
		 * "12345", "Bangalore", 25);
		 */
		// customerDAO.addCustomer(to);

		CustomerTO customerTO = customerDAO.getCustomerByCid(3);
		System.out.println(customerTO);

		// customerDAO.deleteCustomer(2);

		/*
		 * CustomerTO to = new CustomerTO(3,"kumar", "kumar@yahoo.com",
		 * "12345", "Bangalore", 25); customerDAO.updateCustomer(to);
		 */

		/*
		 * List<CustomerTO> list = customerDAO.getAllCustomer(); Iterator it =
		 * list.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		/*
		 * List list = customerDAO.getAllCustomerByCity("patna"); Iterator it =
		 * list.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		System.out.println("Check DB..");

	}

}
