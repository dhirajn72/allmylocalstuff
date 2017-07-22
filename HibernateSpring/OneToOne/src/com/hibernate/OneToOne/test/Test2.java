package com.hibernate.OneToOne.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.OneToOne.Address;
import com.hibernate.OneToOne.Customer;
import com.hibernate.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 3);
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
