package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Account;
import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtility;

public class TestB {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class, 2);
			System.out.println(customer);
			Account account = customer.getAccount();
			System.out.println(account);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
