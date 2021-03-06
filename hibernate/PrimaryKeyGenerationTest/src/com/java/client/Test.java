package com.java.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.pk.CustomerId;
import com.hibernate.util.HibernateUtil;
import com.java.persistence.Customer;

public class Test {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			for (int i = 1; i < 1000; i++) {
				transaction = session.beginTransaction();
				Customer customer = new Customer(CustomerId.getNextId(),
						"Dhiraj", "dhiraj.kumar@yash.com", "9743854499", "25");
				session.persist(customer);
				transaction.commit();

			}
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}
}
