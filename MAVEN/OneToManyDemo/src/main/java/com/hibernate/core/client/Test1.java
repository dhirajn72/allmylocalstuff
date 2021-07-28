package com.hibernate.core.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.java.core.Customer;
import com.java.core.Vehicle;

public class Test1 {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Vehicle vehicle = new Vehicle("Nano", "v4", "100000");
			session.save(vehicle);

			Vehicle vehicle2 = new Vehicle("sumo", "v6", "1000000");
			session.save(vehicle2);

			Vehicle vehicle3 = new Vehicle("Ferari", "v8", "10000000");
			session.save(vehicle3);

			Customer customer = new Customer("Singh", "singh@gmail.com",
					"12345", "25");
			session.save(customer);
			vehicle.setCustomer(customer);
			vehicle2.setCustomer(customer);
			vehicle3.setCustomer(customer);

			Vehicle vehicle4 = new Vehicle("mercedes", "v8", "50000000");
			session.save(vehicle4);

			Vehicle vehicle5 = new Vehicle("pulsar", "v4", "150000");
			session.save(vehicle5);

			Customer customer2 = new Customer("Kumar", "kumar@gmail.com",
					"12345", "25");
			session.save(customer2);
			vehicle4.setCustomer(customer2);
			vehicle5.setCustomer(customer2);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
