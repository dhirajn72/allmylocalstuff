package com.hibernate.inheritance.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.inheritance.CurrentStudent;
import com.hibernate.inheritance.OldStudent;
import com.hibernate.inheritance.Student;
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
					"dk@gmail.com", "9743854499", "dhiraj", "dhiraj@gmail.com",
					"9742765205");
			session.save(weekendStudent);

			Student student = new Student("DHIRAJ");
			session.save(student);

			OldStudent oldStudent = new OldStudent("Raj", "raj",
					"rj@gmail.com", "9999999999");
			session.save(oldStudent);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

	}

}
