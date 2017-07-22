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
		//customerDAO.deleteCustomer(11);
		CustomerTO customerTO = new CustomerTO(20,"Raaj", "raj@yahoo.com",
				Long.parseLong("9742765205"), "Bokaro");
		// customerDAO.updateCustomer(customerTO);

		/*List<CustomerTO> list = customerDAO.getAllCustomers();
		for (CustomerTO to : list) {
			System.out.println(to);
		}*/

		/*CustomerTO cto = customerDAO.getCustomerByCid(15);
		System.out.println(cto);

		System.out.println("*********");*/
		
		/*List<CustomerTO> list1 = customerDAO.getCustomerByCity("Bokaro");
		for (CustomerTO to : list1) {
			System.out.println(to);
		}*/

		CustomerTO cto2 = customerDAO.getCustomerByEmail("raj@yahoo.com");
		 System.out.println(cto2);

	}
}
