package org.hibernate.test.collectionmapping.clients;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.test.collectionmapping.persistence.Student;
import org.hibernate.test.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {
		System.err.println("Result in main(): "+getResults());

	}

	@SuppressWarnings("unchecked")
	public static List<Student> getResults() {
		List<Student> studentsList = null;
		Transaction transaction = null;
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			// Student student = (Student) session.get(Student.class, 5);
	
			//QBC
	/*		Criteria criteria = session.createCriteria(Student.class).setFetchMode("sid", FetchMode.SELECT);
			//criteria.addOrder(Order.desc("sid"));
			criteria.setMaxResults(4);
			@SuppressWarnings("unchecked")
			List<Student> st= (List<Student>) criteria.list();
		*/	
			
			//HQL
			String query="from Student st  order by sid desc";
			Query query2=session.createQuery(query);
			query2.setLockMode("st", LockMode.FORCE);
			studentsList=(List<Student>)query2.list();
			
			
			/*for (Student st : studentsList) {
				System.err.println(st);
			}
			*/
			
			//studentsList=st;
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
