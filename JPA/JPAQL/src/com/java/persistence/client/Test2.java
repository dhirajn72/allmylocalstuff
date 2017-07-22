package com.java.persistence.client;

import java.util.List;

import com.java.persistence.dao.CustomerDAO;
import com.java.persistence.factory.CustomerDAOFactory;
import com.java.persistence.to.CustomerTO;

public class Test2 {

	public static void main(String[] args) {

		CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
		// customerDAO.removeCustomer(1);

		System.out.println("Done !!");

		CustomerTO customerTO = new CustomerTO(5, "Chandu", "chandu@gmail.com",
				"99999999", "Kannur");
		// customerDAO.updateCustomer(customerTO);

		// CustomerTO customerTO2 = customerDAO.getCustomerByCid(3);
		// System.out.println(customerTO2);

		/*
		 * List<CustomerTO> tos = customerDAO.getAllCustomers(); for (CustomerTO
		 * to : tos) { System.out.println(to); }
		 */

		/*
		 * List<CustomerTO> tos = customerDAO.getCustomersByCity("gaya"); for
		 * (CustomerTO to : tos) { System.out.println(to); }
		 */
		List<CustomerTO> tos = customerDAO.getCustomers(2,5);
		for (CustomerTO to : tos) {
			System.out.println(to);
		}

	}

}
