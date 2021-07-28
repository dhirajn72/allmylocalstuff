package com.hibernate.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.OneToManyTest.Customer;
import com.hibernate.persistence.OneToManyTest.Vehicles;
import com.hibernate.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getsSessionFactory().openSession();
			transaction = session.beginTransaction();

			Vehicles vehicles1 = new Vehicles("tata", "V8", "5000000");
			session.save(vehicles1);
			Vehicles vehicles2 = new Vehicles("nano", "V8", "4000000");
			session.save(vehicles2);
			Vehicles vehicles3 = new Vehicles("scorpio", "V4", "3800000");
			session.save(vehicles3);

			Customer customer = new Customer("singh", "singh@gmail.com",
					"12345");
			session.save(customer);
			vehicles1.setCustomer(customer);
			vehicles2.setCustomer(customer);
			vehicles3.setCustomer(customer);

			Vehicles vehicles4 = new Vehicles("tata", "V4", "5000000");
			session.save(vehicles4);
			Vehicles vehicles5 = new Vehicles("nano", "V4", "4000000");
			session.save(vehicles5);

			Customer customer1 = new Customer("kumar", "kumar@gmail.com",
					"12345");
			session.save(customer1);
			vehicles4.setCustomer(customer1);
			vehicles5.setCustomer(customer1);

			Vehicles vehicles6 = new Vehicles("scorpio", "V16", "3800000");
			session.save(vehicles6);
			Vehicles vehicles7 = new Vehicles("scorpio", "V18", "3800000");
			session.save(vehicles7);

			Customer customer3 = new Customer("dhiraj", "dhiraj@gmail.com",
					"12345");
			session.save(customer3);
			vehicles6.setCustomer(customer3);
			vehicles7.setCustomer(customer3);

			Vehicles vehicles8 = new Vehicles("tata", "V16", "5000000");
			session.save(vehicles8);
			Vehicles vehicles9 = new Vehicles("nano", "V18", "4000000");
			session.save(vehicles9);
			Vehicles vehicles10 = new Vehicles("scorpio", "V4", "3800000");
			session.save(vehicles10);

			Customer customer4 = new Customer("DK", "DK@gmail.com",
					"12345");
			session.save(customer4);
			vehicles8.setCustomer(customer4);
			vehicles9.setCustomer(customer4);
			vehicles10.setCustomer(customer4);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}
}
