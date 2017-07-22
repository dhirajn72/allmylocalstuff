package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.OldStudent;
import com.hibernate.inheritance.WeekdayStudent;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtility;

public class TestC {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			WeekdayStudent weekdayStudent = new WeekdayStudent("bizon",
					"bz@gmail.com", "99999", "bk@yahoo.com", "88888888",
					"sottu@yahoo.com", "5555555555");

			weekdayStudent.setCid(01);
			session.save(weekdayStudent);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
