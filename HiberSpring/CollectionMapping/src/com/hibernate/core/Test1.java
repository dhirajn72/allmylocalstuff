package com.hibernate.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {
			List<String> emails = new ArrayList<String>();
			emails.add("dk@gmail.com");
			emails.add("pk@gmail.com");
			emails.add("mk@gmail.com");
			emails.add("sk@gmail.com");
			Set<String> phones = new HashSet<String>();
			phones.add("9743854499");
			phones.add("9743855599");
			phones.add("9743856699");
			phones.add("9743857799");

			Map<String, Object> refs = new HashMap<String, Object>();
			refs.put("AB", "SRI");
			refs.put("AC", "Nivas");
			refs.put("AD", "Dande");

			Customer customer = new Customer("Dhiraj", emails, phones, refs);
			session.save(customer);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			session.close();

		}
	}
}
