package com.hibernate.core.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.core.Customer;
import com.hibernate.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {

		Customer customer = new Customer("DK", "dk@gmail.com", "9743854499");

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer2 = (Customer) session.load(Customer.class, 1);
		customer2.setCname("Kumar");
		customer2.setDate(new Date());
		session.update(customer2);
		transaction.commit();
		session.close();

		HibernateUtil.getSessionFactory().close();

	}

}
