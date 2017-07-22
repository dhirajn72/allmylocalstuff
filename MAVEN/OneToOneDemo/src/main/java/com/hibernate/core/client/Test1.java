package com.hibernate.core.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Address;
import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Address address = new Address("KA", "Bangaluru", "India");
			session.save(address);
			Customer customer = new Customer("Singh", "singh@gmail.com",
					"9743854499", "25");
			session.save(customer);
			customer.setAddress(address);

			Address address2 = new Address("Maharashta", "Pune", "India");
			session.save(address2);
			Customer customer2 = new Customer("Kumar", "kumar@gmail.com",
					"9743854499", "25");
			session.save(customer2);
			customer2.setAddress(address2);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
