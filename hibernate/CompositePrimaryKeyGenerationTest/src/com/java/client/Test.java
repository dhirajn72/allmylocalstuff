package com.java.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.pk.CustID;
import com.hibernate.pk.CustomerId;
import com.hibernate.util.HibernateUtil;
import com.java.persistence.Customer;

public class Test {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			for (int i = 0; i < 10; i++) {
				Session session = HibernateUtil.getSessionFactory()
						.openSession();
				transaction = session.beginTransaction();
				CustID id = new CustID("BG-4", (i + ""));
				Customer customer = new Customer(id, "Dhiraj",
						"dhiraj.kumar@yash.com", "9743854499", "25");
				session.persist(customer);
				transaction.commit();
			}
			// session.close();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}
}
