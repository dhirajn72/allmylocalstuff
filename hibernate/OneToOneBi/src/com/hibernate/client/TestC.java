package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Account;
import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtility;

public class TestC {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Account account = (Account) session.load(Account.class, 3);
			System.out.println(account);
			Customer customer = (Customer) account.getCustomer();
			System.out.println(customer);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
