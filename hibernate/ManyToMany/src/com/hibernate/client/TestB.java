package com.hibernate.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.core.Owner;
import com.hibernate.core.Vehicle;
import com.hibernate.util.HibernateUtility;

public class TestB {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility
					.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Vehicle vehicle = (Vehicle) session.load(Vehicle.class, 2);
			System.out.println(vehicle);
			List<Owner> owners = vehicle.getOwner();
			for (Owner owner : owners) {
				System.out.println(owner);
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
