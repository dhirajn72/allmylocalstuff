package com.hibernate.persistence.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.persistence.Customer;
import com.hibernate.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = new Customer("Singh", "singh@gmail.com",
					"9743854499", "25");
			session.save(customer);
			transaction.commit();
			session.close();
			System.out.println("******************");
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			transaction = session.beginTransaction();
			Customer customer2 = new Customer("Singh", "singh@gmail.com",
					"9743854499", "25");
			session.save(customer2);
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
