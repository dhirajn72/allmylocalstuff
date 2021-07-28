package org.hibernate.test.collectionmapping.clients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.test.collectionmapping.persistence.Student;
import org.hibernate.test.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			transaction = session.beginTransaction();

			String[] courses = { "BCA", "MCA", "MTech" };
			List<String> emails = new ArrayList<String>();
			emails.add("test@gmail.com");
			emails.add("dhiraj@gmail.com");
			emails.add("kumar@gmail.com");
			Set<Long> phones = new HashSet<Long>();
			phones.add(12345l);
			phones.add(12345l);

			Map<String, Long> refs = new HashMap<String, Long>();
			refs.put("aaa", new Long(123));
			refs.put("bbb", new Long(125));
			refs.put("ccc", new Long(126));

			Student s1 = new Student("kumar", "22/09/1990", "BCA", courses,
					emails, phones, refs);
			session.save(s1);
			Student s2 = new Student("rajeev", "22/09/1990", "BCA", courses,
					emails, phones, refs);
			session.save(s2);
			Student s3 = new Student("Singh", "22/09/1990", "BCA", courses,
					emails, phones, refs);
			session.save(s3);
			Student s4 = new Student("Sri", "22/09/1990", "BCA", courses,
					emails, phones, refs);

			session.save(s4);
			Student s5 = new Student("Binod", "22/09/1990", "BCA", courses,
					emails, phones, refs);

			session.save(s5);
			Student s6 = new Student("Ram", "22/09/1990", "BCA", courses,
					emails, phones, refs);

			session.save(s6);

			transaction.commit();
			session.close();

			System.err.println("Record saved in DB");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}

	}
}
