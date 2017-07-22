package com.hibernate.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.OneToManyTest.Customer;
import com.hibernate.persistence.OneToManyTest.Vehicles;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getsSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class, 2);
			System.out.println(customer);
			List<Vehicles> vehicles = customer.getVehicles();
			for (Vehicles v : vehicles) {
				System.out.println(v);
			}
			System.out.println("**********");
			String hql = "from Vehicles where  vmodel=? ";
			Query query = session.createQuery(hql);
			query = query.setParameter(0, "V16");
			List list = query.list();

			for (Object ob : list) {
				System.out.println(ob.toString());
			}
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}
}
