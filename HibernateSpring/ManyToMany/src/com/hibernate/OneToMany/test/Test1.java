package com.hibernate.OneToMany.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.OneToMany.Customer;
import com.hibernate.OneToMany.Vehicle;
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
			vehicle.setCustomer(customer);
			session.save(vehicle);

			Vehicle vehicle1 = new Vehicle("BMW", "M-99");
			vehicle1.setCustomer(customer);
			session.save(vehicle1);

			Vehicle vehicle2 = new Vehicle("Ferari", "M-99");
			vehicle2.setCustomer(customer);
			session.save(vehicle2);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}
}
