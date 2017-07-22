package com.hibernate.core;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			/*
			 * Criteria criteria = session.createCriteria(Customer.class);
			 * criteria = criteria.setFetchMode("emails", FetchMode.JOIN);
			 * criteria = criteria.setFetchMode("phones", FetchMode.JOIN);
			 * criteria = criteria.setFetchMode("map_data", FetchMode.JOIN);
			 */

			// Customer customer = (Customer) criteria.list().get(0);
			Customer customer = (Customer) session.get(Customer.class, 1);
			System.out.println(customer);
			List<String> emails = customer.getEmails();
			for (String email : emails) {
				System.out.println(email);
			}
			System.out.println("*********");
			Set<String> phones = customer.getPhones();
			for (String phone : phones) {
				System.out.println(phone);
			}
			System.out.println("*********");
			Map<String, Object> refs = customer.getRefs();
			Set<Entry<String, Object>> entries = refs.entrySet();
			for (Entry<String, Object> ref : entries) {
				System.out.println(ref.getKey() + " " + ref.getValue());
			}

			transaction.commit();
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			session.close();

		}
	}
}
