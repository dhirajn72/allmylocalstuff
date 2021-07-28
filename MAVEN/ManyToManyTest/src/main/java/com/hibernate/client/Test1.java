package com.hibernate.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.ManyToManyTest.Customers;
import com.hibernate.persistence.ManyToManyTest.Vehicles;
import com.hibernate.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			Vehicles vehicles1 = new Vehicles("mercedese", "V8", "5000000");
			session.save(vehicles1);
			Vehicles vehicles2 = new Vehicles("ferari", "V8", "6500000");
			session.save(vehicles2);
			Vehicles vehicles3 = new Vehicles("toyota", "V4", "3000000");
			session.save(vehicles3);
			Vehicles vehicles4 = new Vehicles("ford", "V8", "5500000");
			session.save(vehicles4);

			Set<Vehicles> vehicles = new HashSet<Vehicles>();
			vehicles.add(vehicles1);
			vehicles.add(vehicles2);
			vehicles.add(vehicles3);
			vehicles.add(vehicles4);

			Customers cust = new Customers("Dhiraj", "dhiraj@gmail.com",
					"12345");
			session.save(cust);
			cust.getVehicles().add(vehicles1);
			cust.getVehicles().add(vehicles2);
			cust.getVehicles().add(vehicles3);
			cust.getVehicles().add(vehicles4);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

}
