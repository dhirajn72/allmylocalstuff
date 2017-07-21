package com.spring.jpaTemp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDao");
		System.out.println("******add customer**********");
		CustomerTO customerTO = new CustomerTO("kumar", "kumar@gmail.com",
				"9743854499", "Ranchi", 24);
		customerDAO.addCustomer(customerTO);
		/*System.out.println("******delete customer**********");

		customerDAO.deleteCustomer(11);
		System.out.println("*******update customer*********");
		CustomerTO cust1 = new CustomerTO(10, "dk", "dk@gmail.com",
				"9743854499", "Ranchi", 24);
		customerDAO.updateCustomer(cust1);
		System.out.println("*******get all customer*********");
		List<CustomerTO> list = customerDAO.getAllCustomer();
		for (CustomerTO to : list) {
			System.out.println(to);
		}
		System.out.println("******get all customer by city**********");
		List list1 = customerDAO.getAllCustomerByCity("ranchi");
		for (Object ob : list1) {
			System.out.println(ob);
		}
		System.out.println("******get customer by cid**********");
		CustomerTO to = customerDAO.getCustomerByCid(3);
		System.out.println(to);
*/
	}
}
