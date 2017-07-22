package org.hibernate.test.collectionmapping.clients;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.test.collectionmapping.persistence.Student;
import org.hibernate.test.util.HibernateUtil;

public class Test4 {

	public static void main(String[] args) {
		System.err.println("Result in main(): " + getResults());

	}

	@SuppressWarnings("unchecked")
	public static List<Student> getResults() {
		List<Student> studentsList = null;
		Transaction transaction = null;
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			transaction = session.beginTransaction();
			String query = "from Student s order by s.sname desc";

			Query q = session.createQuery(query);
		//	q.setMaxResults(2);
			List<Student> students = (List<Student>) q.list();
			for (Student student : students) {
				System.err.println(student);
			}
			transaction.commit();
			session.close();

			System.err.println("Record fetched successfully !!");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		return studentsList;

	}

}
