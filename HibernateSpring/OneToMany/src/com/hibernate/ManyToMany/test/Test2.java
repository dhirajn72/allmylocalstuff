package com.hibernate.ManyToMany.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.ManyToMany.Customer;
import com.hibernate.ManyToMany.Vehicle;
import com.hibernate.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 1);
			System.out.println(customer);
			List<Vehicle> vehicles = customer.getVehicle();
			for (Vehicle v : vehicles) {
				System.out.println(v);
			}

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
