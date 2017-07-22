package com.java.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.hibernateUtil.HibernateUtil;
import com.java.persistence.WeekendStudent;

public class Test3 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getsessSessionFactory()
					.openSession();
			transaction = session.beginTransaction();

			WeekendStudent weekendStudent = new WeekendStudent("dhiraj",
					"ranchi", "enabled", 100000, 5000, "11/12/15", "Bangalore",
					"SDSOFT", "dk@sdsoft.com", 360000);

			session.save(weekendStudent);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
