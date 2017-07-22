package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.OldStudent;
import com.hibernate.inheritance.WeekdayStudent;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtility;

public class TestA {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			WeekendStudent weekendStudent = new WeekendStudent("dk",
					"dk@gmail.com", "9743854499", "dkm@yahoo.com",
					"9743854499", "ekd@gmail.com", "9743854499");

			WeekdayStudent weekdayStudent = new WeekdayStudent("bizon",
					"bz@gmail.com", "99999", "bk@yahoo.com", "88888888",
					"sottu@yahoo.com", "5555555555");

			OldStudent oldStudent = new OldStudent("raju", "raju@gmail.com",
					"99999", 12, "jaru@yahoo.com", "33333333");

			session.save(weekendStudent);
			session.save(weekdayStudent);
			session.save(oldStudent);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
