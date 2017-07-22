package com.java.core.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.core.Address;
import com.java.core.Customer;
import com.java.core.Vehicle;
import com.java.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Address address = new Address(42, "MS Palya", "560097", "KA");
		session.save(address);
		Vehicle vehicle = new Vehicle("NANO", "2010", 150000);
		session.save(vehicle);
		Vehicle vehicle1 = new Vehicle("Scorpio", "2015", 1500000);
		session.save(vehicle1);
		Vehicle vehicle2 = new Vehicle("Innova", "2010", 1800000);
		session.save(vehicle2);

		Customer customer = new Customer("Dhiraj", "dhirajkr.info@gmail.com",
				"9743854499");
		customer.setAddress(address);
		session.save(customer);

		vehicle.setCustomer(customer);
		vehicle1.setCustomer(customer);
		vehicle2.setCustomer(customer);

		address.setCustomer(customer);

		transaction.commit();
		session.close();

	}
}
