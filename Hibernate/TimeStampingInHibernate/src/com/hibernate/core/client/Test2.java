package com.hibernate.core.client;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Customer;
import com.java.hibernateUtil.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil
					.getsessSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 2);
			customer.setCname("kumar ");
			System.out.println(customer);
			session.update(customer);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
