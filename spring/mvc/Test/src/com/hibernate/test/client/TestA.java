package com.hibernate.test.client;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.test.Customer;
import com.hibernate.util.HibernateUtil;

public class TestA {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = new Customer("DK", "dk@gmail.com", "12345");
			session.save(customer);
			transaction.commit();
			sessionFactory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
