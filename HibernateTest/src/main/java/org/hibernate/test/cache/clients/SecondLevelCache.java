package org.hibernate.test.cache.clients;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.test.collectionmapping.persistence.Student;
import org.hibernate.test.util.HibernateUtil;

public class SecondLevelCache {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			transaction = session.beginTransaction();
			String query = "from Student stu";
			Query query2 = session.createQuery(query);
			query2.setCacheable(true);
			
			@SuppressWarnings("unchecked")
			List<Student> students = query2.list();
			for (Student student : students) {
				System.err.println(student);
			}
			System.err
					.println("***************First time from cache******************");
			Query query3 = session.createQuery(query);
			query3.setCacheable(true);
			@SuppressWarnings("unchecked")
			List<Student> students2 = query3.list();
			for (Student student : students2) {
				System.err.println(student);
			}
			System.err
					.println("****************Second time from cache*****************");
			Query query4 = session.createQuery(query);
			query4.setCacheable(true);
			
			@SuppressWarnings("unchecked")
			List<Student> students3 = query4.list();
			for (Student student : students3) {
				System.err.println(student);
			}
			System.err
					.println("**************Third time from cache*******************");
			Query query5 = session.createQuery(query);
			query5.setCacheable(true);
			@SuppressWarnings("unchecked")
			List<Student> students4 = query4.list();
			for (Student student : students4) {
				System.err.println(student);
			}
			transaction.commit();
			Thread.currentThread().sleep(5000);
			session.close();

			System.err.println("Record fetched successfully !!");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}

}
