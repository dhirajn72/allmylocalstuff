package com.hibernate.client;

import java.io.PrintStream;
import java.util.List;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.dao.CustomerDAOFactory;
import com.hibernate.to.CustomerTO;

public class Test2 {
	public static void main(String[] args) throws Exception {

		CustomerDAO dao = CustomerDAOFactory.getCustomerDAO();
		// System.out.println("Printing to file, please wait");
		// System.setOut(new PrintStream("/home/dhiraj/customers.txt"));
		List<CustomerTO> tos = dao.getAllCustomers();
		for (CustomerTO to : tos) {
			System.out.println(to);
		}

		CustomerTO to = dao.getCustomerById(4);
		System.out.println(to);

		/*
		 * List<CustomerTO> tos = dao.getCustomerByCity("Ranchi", 1, 10); for
		 * (CustomerTO to : tos) { System.out.println(to); }
		 */

		/*
		 * List<CustomerTO> tos = dao.getCustomerByCtype("SA"); for (CustomerTO
		 * to : tos) { System.out.println(to); }
		 */
		/*
		 * List<CustomerTO> tos = dao.getCustomerByAge(26); for (CustomerTO to :
		 * tos) { System.out.println(to); }
		 */

	}
}
