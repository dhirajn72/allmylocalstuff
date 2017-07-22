package com.hibernate.core.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.java.core.Customer;
import com.java.core.Vehicle;

public class Test2 {

	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 2);
			System.out.println(customer);
			List<Vehicle> vehicles = customer.getVehicle();
			for (Vehicle v : vehicles) {
				System.out.println(v);
			}

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
