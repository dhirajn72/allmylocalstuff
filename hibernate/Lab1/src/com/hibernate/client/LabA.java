package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
			Customer cust1 = new Customer("Singh", "singh@gmail.com",
					"9743854499", "Bangalore");
			Customer cust2 = new Customer("DK", "dk@gmail.com", "9743854499",
					"Aurangabad");
			Customer cust3 = new Customer("MK", "mk@gmail.com", "9743854499",
					"Gaya");
			Customer cust4 = new Customer("Kumar", "kumar@gmail.com",
					"9743854499", "Ranchi");
			Customer cust5 = new Customer("Sri", "sri@gmail.com", "9743854499",
					"Bangalore");

			session.save(cust1);
			session.save(cust2);
			session.save(cust3);
			session.save(cust4);
			session.save(cust5);

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
