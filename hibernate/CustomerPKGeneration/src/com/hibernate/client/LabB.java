package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtility;

public class LabB {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class,
					"CID-005");
			Customer customer2 = (Customer) session.load(Customer.class,
					"CID-015");
			System.out.println("*********************");
			System.out.println(customer);
			System.out.println(customer2);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
