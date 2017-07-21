package com.hibernate.OneToOne.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.OneToOne.Address;
import com.hibernate.OneToOne.Customer;
import com.hibernate.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Address address = new Address("42", 560097, "KA");
			session.save(address);
			Customer customer = new Customer("Dhiraj", "dhiraj@gmail.com",
					"9743854499", address);
			session.save(customer);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
