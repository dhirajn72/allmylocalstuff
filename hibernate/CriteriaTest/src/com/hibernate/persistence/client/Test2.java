package com.hibernate.persistence.client;

import java.util.List;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerDAOFactory;
import com.hibernate.persistence.dao.CustomerDAO;

public class Test2 {

	public static void main(String[] args) {
		CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
		System.out.println("All Customers");
		List<Customer> customers = customerDAO.getAllCustomer();
		for (Customer c : customers) {
			System.out.println(c);
		}
		System.err.println("**************************");
		List<Customer> customers2 = customerDAO.getCustomersByCity("bokaro");
		for (Customer c : customers2) {
			System.out.println(c);
		}
		System.err.println("**************************");
		Customer customers3 = customerDAO
				.getCustomerByEmail("chhotu@gmail.com");
		System.out.println(customers3);

	}

}
