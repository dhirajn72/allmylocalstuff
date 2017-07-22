package com.hibernate.inheritance.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.CurrentStudent;
import com.hibernate.inheritance.Student;
import com.hibernate.inheritance.WeekendStudent;
import com.hibernate.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Transaction transaction = null;
		try {
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Student student = (Student) session.load(Student.class, 2);
			session.delete(student);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

	}

}
