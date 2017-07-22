package com.hibernate.core.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Address;
import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 2);
			System.out.println(customer);
			Address address = customer.getAddress();
			System.out.println(address);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
