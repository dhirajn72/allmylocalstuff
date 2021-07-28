package com.hibernate.core.client;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Customer;
import com.java.hibernateUtil.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil
					.getsessSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = new Customer("Dhiraj", "dhiraj@gmail.com",
					"12345", new Date());
			session.save(customer);
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
