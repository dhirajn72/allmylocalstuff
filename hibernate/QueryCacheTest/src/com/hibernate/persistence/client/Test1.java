package com.hibernate.persistence.client;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerDAOFactory;
import com.hibernate.persistence.dao.CustomerDAO;

public class Test1 {

	public static void main(String[] args) {
		CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
		Customer customer1 = new Customer("Singh", "singh@gmail.com",
				"9743854499", "24", "ranchi");
		Customer customer2 = new Customer("dhiraj", "dhiraj@gmail.com",
				"9743854499", "24", "ranchi");
		Customer customer3 = new Customer("raj", "raj@gmail.com", "9743855588",
				"20", "bokaro");
		Customer customer4 = new Customer("manish", "manish@gmail.com",
				"9743854499", "35", "patna");
		Customer customer5 = new Customer("sri", "sri@gmail.com", "9756784499",
				"40", "hyderabad");
		Customer customer6 = new Customer("bijan", "bijan@gmail.com",
				"9743854499", "24", "bokaro");
		Customer customer7 = new Customer("chhotu", "chhotu@gmail.com",
				"9724854499", "25", "bokaro");
		Customer customer8 = new Customer("mk", "mk@gmail.com", "9743854433",
				"35", "patna");
		customerDAO.addCustomer(customer1);
		customerDAO.addCustomer(customer2);
		customerDAO.addCustomer(customer3);
		customerDAO.addCustomer(customer4);
		customerDAO.addCustomer(customer5);
		customerDAO.addCustomer(customer6);
		customerDAO.addCustomer(customer7);
		customerDAO.addCustomer(customer8);

	}

}
