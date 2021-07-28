package com.hibernate.inheritance.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.CurrentStudent;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Transaction transaction = null;
		try {
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			WeekendStudent weekendStudent = new WeekendStudent("dk", "dks",
					"dk@gmail.com", "12345", "dhiraj", "dhiraj@gmail.com",
					"12345");

			session.save(weekendStudent);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

	}

}
