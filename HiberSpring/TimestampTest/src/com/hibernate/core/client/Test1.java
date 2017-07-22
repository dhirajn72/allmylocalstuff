package com.hibernate.core.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {

		Customer customer = new Customer("DK", "dk@gmail.com", "9743854499");

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();

		HibernateUtil.getSessionFactory().close();

	}

}
