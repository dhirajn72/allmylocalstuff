package com.hibernate.persistence.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.CustID;
import com.hibernate.persistence.Customer;
import com.hibernate.persistence.IDGenerator;
import com.hibernate.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			for (int i = 0; i < 2000; i++) {
				Transaction transaction = session.beginTransaction();
				CustID id = IDGenerator.getNextID();
				Customer customer = new Customer(id, "Dhiraj",
						"dhiraj@gmail.com");
				session.save(customer);
				transaction.commit();

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			session.close();

		}

	}

}
