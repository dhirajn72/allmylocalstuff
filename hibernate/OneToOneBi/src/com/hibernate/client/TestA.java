package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Account;
import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtility;

public class TestA {
	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = new Customer("singh", "singh@gmail.com",
					"9743855599", 25);
			Account account = new Account("patna", "SBI-01", "patna");

			session.save(customer);
			session.save(account);
			customer.setAccount(account);
			account.setCustomer(customer);
			transaction.commit();
			session.close();
			System.out.println("Done !! Check DB");

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
