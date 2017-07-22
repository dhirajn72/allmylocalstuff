package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.HibernateUtil;
import com.hibernate.test.SID;
import com.hibernate.test.Student;

public class Test {
	public static void main(String[] args) {

		Transaction transaction = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			SID sid = new SID("JLC-001", 66);
			SID sid2 = new SID("JLC-001", 88);
			SID sid3 = new SID("JLC-001", 77);

			Student student = new Student(sid, "Dhiraj", "dhiraj@gmail.com",
					"9743854499");
			session.save(student);
			Student student2 = new Student(sid2, "Dhiraj", "dhiraj@gmail.com",
					"9743854499");
			session.save(student2);
			Student student3 = new Student(sid3, "Dhiraj", "dhiraj@gmail.com",
					"9743854499");
			session.save(student3);
			transaction.commit();
			System.out.println("Check DB !!!");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();

		}

	}
}
