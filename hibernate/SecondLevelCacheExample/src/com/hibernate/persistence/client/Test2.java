package com.hibernate.persistence.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.persistence.Customer;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class, 2);
			System.out.println(customer);
			transaction.commit();
			session.close();
			System.out.println("******************");

			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer1 = (Customer) session.load(Customer.class, 2);
			System.out.println(customer1);
			transaction.commit();
			session.close();
			System.out.println("************");

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
