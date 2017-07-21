package com.java.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.hibernateUtil.HibernateUtil;
import com.java.persistence.OldStudent;
import com.java.persistence.WeekendStudent;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getsessSessionFactory()
					.openSession();
			transaction = session.beginTransaction();

			OldStudent oldStudent = new OldStudent("kumar", "ranchi",
					"enabled", 15000, "SLK", "dhirajkr@slk.com", 260000);
			oldStudent.setSid(1);
			session.save(oldStudent);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
