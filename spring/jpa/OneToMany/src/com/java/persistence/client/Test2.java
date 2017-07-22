package com.java.persistence.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.persistence.Vehicle;
import com.java.persistence.Customer;
import com.java.persistence.utils.HibernateUtils;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 1);
			 session.delete(customer);
			/*System.out.println(customer);
			List<Vehicle> list = customer.getVehicles();
			for (Vehicle v : list) {
				System.out.println(v);
			}*/

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
