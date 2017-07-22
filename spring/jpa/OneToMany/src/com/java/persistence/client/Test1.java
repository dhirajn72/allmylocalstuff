package com.java.persistence.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.persistence.Vehicle;
import com.java.persistence.Customer;
import com.java.persistence.utils.HibernateUtils;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer1 = new Customer("himanshu", "himan@gmail.com",
					"9743854499", "24");
			session.save(customer1);

			Vehicle vehicle1 = new Vehicle("honda", "SS", "50000");
			session.save(vehicle1);
			Vehicle vehicle2 = new Vehicle("pulsar", "SS", "60000");
			session.save(vehicle2);
			Vehicle vehicle3 = new Vehicle("splendor", "SS", "40000");
			session.save(vehicle3);

			vehicle1.setCustomer(customer1);
			vehicle2.setCustomer(customer1);
			vehicle3.setCustomer(customer1);

			Customer customer2 = new Customer("raj", "raj@gmail.com",
					"9743854499", "24");
			session.save(customer2);

			Vehicle vehicle4 = new Vehicle("honda", "SS", "50000");
			session.save(vehicle4);
			Vehicle vehicle5 = new Vehicle("pulsar", "SS", "60000");
			session.save(vehicle5);

			vehicle4.setCustomer(customer2);
			vehicle5.setCustomer(customer2);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
