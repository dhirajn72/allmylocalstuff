package com.java.persistence.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.persistence.Address;
import com.java.persistence.Customer;
import com.java.persistence.utils.HibernateUtils;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 12);
			session.delete(customer);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
