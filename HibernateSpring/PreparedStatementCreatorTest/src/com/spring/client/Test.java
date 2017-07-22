package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Id.CustomerID;
import com.spring.dao.CustomerDAO;
import com.spring.to.Customer;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerDAO dao = (CustomerDAO) applicationContext
				.getBean("customerDAOImpl");

		Customer customer = new Customer(CustomerID.NextCid(), "dhiraj",
				"dhiraj@gmail.com", "9934369400", "patna");

		// dao.addCustomer(customer);

		// dao.deleteCustomer(2);

		Customer customer2 = new Customer(5, "kr", "kr@gmail.com",
				"9934369400", "Bangalore");
		// dao.updateCustomer(customer2);

		// Customer customer3 = dao.getCustomer(5);
		// System.out.println(customer3);

		/*List<Customer> list = dao.getAllCustomers();
		for (Customer c : list) {
			System.out.println(c);
		}*/

	/*	Customer customer3 = dao.getCustomerByEmail("kr@gmail.com");
		System.out.println(customer3);*/
		
		List<Customer> getList=dao.getCustomersByCity("patna");
		for (Customer c :getList) {
			System.out.println(c);
		}
		
		

	}
}
