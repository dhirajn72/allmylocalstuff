package com.hibernate.ManyToMany.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.ManyToMany.Customer;
import com.hibernate.ManyToMany.Vehicle;
import com.hibernate.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = new Customer("Dhiraj", "dhiraj@gmail.com",
					"9743854499");

			session.save(customer);
			Vehicle vehicle = new Vehicle("Mercedes", "M-99");
			session.save(vehicle);

			Vehicle vehicle1 = new Vehicle("BMW", "M-99");
			session.save(vehicle1);

			Vehicle vehicle2 = new Vehicle("Ferari", "M-99");
			session.save(vehicle2);

			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			vehicles.add(vehicle);
			vehicles.add(vehicle1);
			vehicles.add(vehicle2);
			customer.setVehicle(vehicles);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
