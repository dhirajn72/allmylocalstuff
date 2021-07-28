package com.hibernate.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.collection.Customer;
import com.hibernate.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		Transaction transaction = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			List<String> emails = new ArrayList<String>();
			emails.add("dhiraj@gmail.com");
			emails.add("dhiraj@yahoo.com");
			emails.add("dhiraj@rediff.com");
			emails.add("dhiraj@google.com");

			Set<String> phones = new HashSet<String>();
			phones.add("12345");
			phones.add("12345");
			phones.add("9744338877");

			Map<String, String> refs = new HashMap<String, String>();
			refs.put("Ref1", "ranjan");
			refs.put("Ref2", "bijon");
			refs.put("Ref3", "ashish");

			Customer customer = new Customer(88, "Singh", emails, phones, refs);

			session.save(customer);
			transaction.commit();
			session.close();
			System.out.println("Check DB !!!");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

		}

	}
}
