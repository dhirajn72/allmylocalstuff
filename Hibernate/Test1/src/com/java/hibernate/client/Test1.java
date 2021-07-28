package com.java.hibernate.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.hibernate.Student;
import com.java.hibernate.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			List<String> emails = new ArrayList<String>();
			emails.add("singh@gmail.com");
			emails.add("kumar@gmail.com");
			emails.add("dhiraj@gmail.com");

			Set<String> phones = new HashSet<String>();
			phones.add("12345");
			phones.add("12345");
			phones.add("9934369400");

			Student student = new Student("dhiraj", "dk@gmail.com",
					"9999999999", emails, phones);

			session.save(student);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
