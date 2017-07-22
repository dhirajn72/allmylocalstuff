package com.hibernate.client;

import java.util.List;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.daoFactory.CustomerDAOFactory;
import com.hibernate.to.CustomerTO;

public class TestB {

	public static void main(String[] args) {
		CustomerDAO dao = CustomerDAOFactory.getCustomerDAO();

		// deleteing the customer by cid
		// dao.deleteCustomerByCid(5);
		System.out.println("************");
		// update customer

		CustomerTO customerTO = new CustomerTO(5, "rajeev", "rajeev@yahoo.com",
				"99934367445", 22, "INFOSYS");
		// dao.updateCustomer(customerTO);
		// System.out.println("************");
		// getting all the records from db

		System.out.println("*****1st time*******");
		List<CustomerTO> list1 = dao.getAllCustomers();
		for (CustomerTO to : list1) {
			System.out.println(to);
		}
		System.out.println("************");
		// List<CustomerTO> list2 = dao.getAllCustomersByCompany("SDSOFT");
		// for (CustomerTO cust : list2) {
		// System.out.println(cust);
		// }
		/*
		 * System.out.println("************"); CustomerTO customerTO2 =
		 * dao.getCustomerByCid(10); System.out.println(customerTO2);
		 */

		System.out.println("****2nd time********");
		List<CustomerTO> list2 = dao.getAllCustomers();
		for (CustomerTO to : list2) {
			System.out.println(to);
		}
	}

}
