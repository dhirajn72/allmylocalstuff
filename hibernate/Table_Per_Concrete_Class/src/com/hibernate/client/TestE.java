package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.OldStudent;
import com.hibernate.inheritance.WeekdayStudent;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtility;

public class TestE {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			OldStudent oldStudent = new OldStudent("raju", "raju@gmail.com",
					"99999", 12, "jaru@yahoo.com", "33333333");
			oldStudent.setCid(03);
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
