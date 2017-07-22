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

public class Test3 {

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
			Student student = (Student) session.load(Student.class, 5);
			System.err.println(student);
			transaction.commit();
			session.close();
			
			student.setSname("update_02");
			System.err.println("Updated detached object: "+student);
			
			System.err.println(factory.openSession().get(Student.class, 5));
			

			System.err.println("Record fetched successfully !!");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		return studentsList;

	}

}
