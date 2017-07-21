package com.java.core.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.core.Address;
import com.java.core.Customer;
import com.java.core.Vehicle;
import com.java.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		 Customer customer = (Customer) session.load(Customer.class, 1);
		//Criteria criteria = session.createCriteria(Customer.class);
		//criteria.setFetchMode("vehicle", FetchMode.EAGER);
		//Customer customer = (Customer) criteria.list().get(0);
		System.out.println(customer);
		Address address = customer.getAddress();
		System.out.println(address);
		List<Vehicle> vehicles = customer.getVehicle();
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}

		transaction.commit();
		session.close();

	}
}
