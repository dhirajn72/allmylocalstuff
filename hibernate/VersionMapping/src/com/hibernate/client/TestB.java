package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

import com.hibernate.util.HibernateUtil;
import com.hibernate.version.Customer;

public class TestB {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 5);
			System.out.println(customer);
			customer.setCname("kumar");
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
	}
}
