package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.OldStudent;
import com.hibernate.inheritance.WeekdayStudent;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtility;

public class TestD {

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
			weekendStudent.setCid(02);
			session.save(weekendStudent);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
