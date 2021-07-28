package com.java.core.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.core.Address;
import com.java.core.Customer;
import com.java.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Address address = new Address(42, "MS Palya", "560097", "KA");
		session.save(address);

		Customer customer = new Customer("Dhiraj", "info@gmail.com",
				"12345");
		session.save(customer);
		customer.setAddress(address);
		transaction.commit();
		session.close();

	}
}
