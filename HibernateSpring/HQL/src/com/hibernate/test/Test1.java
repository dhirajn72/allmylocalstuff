package com.hibernate.test;

import java.util.List;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.dao.DaoFactory;
import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerTo;

public class Test1 {
	public static void main(String[] args) {

		CustomerDAO dao = DaoFactory.getCustomerDAO();

/*		CustomerTo to = new CustomerTo(3, "Dhiraj", "dk@gmail.com",
				"12345", 24, 50000, "Visa", "Bangalore", "Bihar");
*/
		// dao.updateCustomer(to);

		/*
		 * List<CustomerTo> customers = dao.getAllCustomer(); for (CustomerTo c
		 * : customers) { System.out.println(c); }
		 */

		/*
		 * List<CustomerTo> customers1 = dao.getCustomerByCity("Bangalore"); for
		 * (CustomerTo c : customers1) { System.out.println(c); }
		 */
/*
		CustomerTo to2 = dao.getCustomerEmail("raj@gmail.com");
		System.out.println(to2);*/
		
		dao.deleteCustomerByEmail("raj@gmail.com");
		
		
		
		
	}
}
