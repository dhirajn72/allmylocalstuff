package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.CIDGenerator;
import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtility;

public class LabA {
	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer cust1 = new Customer(CIDGenerator.getNextCid(), "Singh",
					"singh@gmail.com", "9743854499", "Bangalore");
			session.save(cust1);

			transaction.commit();
			session.close();

			System.out.println("Done !! Check DB");
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
