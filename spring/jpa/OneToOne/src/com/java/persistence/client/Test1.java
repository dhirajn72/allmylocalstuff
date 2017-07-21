package com.java.persistence.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.persistence.Address;
import com.java.persistence.Customer;
import com.java.persistence.utils.HibernateUtils;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = new Customer("himanshu", "dhiraj@gmail.com",
					"9743854499", "24");
			session.save(customer);
			Address address = new Address("aurangabad", 843004, "bihar",
					"India");
			session.save(address);
			customer.setAddress(address);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
