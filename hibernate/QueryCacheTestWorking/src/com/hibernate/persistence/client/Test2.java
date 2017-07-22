package com.hibernate.persistence.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerDAOFactory;
import com.hibernate.persistence.dao.CustomerDAO;
import com.hibernate.persistence.dao.CustomerDAOImpl;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
		 * System.out.println("All Customers"); List<Customer> customers =
		 * customerDAO.getAllCustomer(); for (Customer c : customers) {
		 * System.out.println(c); }
		 * 
		 * List<Customer> customers1 = customerDAO.getAllCustomer(); for
		 * (Customer c : customers1) { System.out.println(c); }
		 */
		/*
		 * System.err.println("**************************"); List<Customer>
		 * customers2 = customerDAO.getCustomersByCity("bokaro"); for (Customer
		 * c : customers2) { System.out.println(c); }
		 */
		/*
		 * System.err.println("**************************"); Customer customers3
		 * = CustomerDAOFactory.getCustomerDAO()
		 * .getCustomerByEmail("chhotu@gmail.com");
		 * System.out.println(customers3);
		 */

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		Customer customers3 = daoImpl.getCustomerByEmail("chhotu@gmail.com");
		System.out.println(customers3);
		transaction.commit();
		session.close();
		System.out.println("***************");
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Customer customers4 = daoImpl.getCustomerByEmail("chhotu@gmail.com");
		System.out.println(customers3);
		transaction.commit();
		session.close();

	}
}
