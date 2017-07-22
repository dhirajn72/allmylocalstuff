package com.hibernate.client;

import java.util.List;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.daoFactory.CustomerDAOFactory;
import com.hibernate.to.CustomerTO;

public class TestB {

	public static void main(String[] args) {
		CustomerDAO dao = CustomerDAOFactory.getCustomerDAO();

		// deleteing the customer by cid
		//dao.deleteCustomerByCid(5);
		System.out.println("************");
		// delete customer
		// dao.deleteCustomerByCid(1);

		// update customer
		CustomerTO to = new CustomerTO(2, null, "rajput@yahoo.com", null, 0,
				null);
		dao.updateCustomer(to);

	}

}
