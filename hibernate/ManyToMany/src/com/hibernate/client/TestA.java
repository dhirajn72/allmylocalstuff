package com.hibernate.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Owner;
import com.hibernate.core.Vehicle;
import com.hibernate.util.HibernateUtility;

public class TestA {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Owner owner1 = new Owner("Singh", "singh@gmail.com", "9743854499");
			Owner owner2 = new Owner("dhiraj", "dhiraj@gmail.com", "9742765205");
			session.save(owner1);
			session.save(owner2);

			Vehicle vehicle1 = new Vehicle("benz", "black", "300000");
			Vehicle vehicle2 = new Vehicle("nano", "red", "100000");
			Vehicle vehicle3 = new Vehicle("scorpio", "white", "800000");
			Vehicle vehicle4 = new Vehicle("innova", "blue", "100000");
			session.save(vehicle1);
			session.save(vehicle2);
			session.save(vehicle3);
			session.save(vehicle4);

			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			vehicles.add(vehicle1);
			vehicles.add(vehicle2);
			vehicles.add(vehicle3);
			owner1.setVehicle(vehicles);

			List<Vehicle> vehicles2 = new ArrayList<Vehicle>();
			vehicles2.add(vehicle2);
			vehicles2.add(vehicle3);
			vehicles2.add(vehicle4);
			owner2.setVehicle(vehicles2);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
