package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.CurrentStudent;
import com.hibernate.inheritance.OldStudent;
import com.hibernate.inheritance.WeekdayStudent;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtility;

public class TestB {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			CurrentStudent currentStudent = new CurrentStudent("singh",
					"singh@gmail.com", "999999", "sk@gmail.com", "888888");
			currentStudent.setCid(01);
			session.save(currentStudent);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
