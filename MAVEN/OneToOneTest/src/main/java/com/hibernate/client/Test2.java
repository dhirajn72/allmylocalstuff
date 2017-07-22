package com.hibernate.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.OneToOneTest.Customer;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			String hql = "from Customer c where c.address.state=?";
			Query query = session.createQuery(hql);
			query = query.setParameter(0, "Bihar");
			List<Customer> list = query.list();
			for (Customer c : list) {
				System.out.println(c);
			}
			System.out.println("*************");

			// getting the second highest sallary
			// hql querries are case insensitive
			String hql2 = "SELecT salary FrOm Customer c OrDEr bY salary DeSc";
			Query query2 = session.createQuery(hql2);
			query2 = query2.setFirstResult(1);
			query2 = query2.setMaxResults(1);
			Double d = (Double) query2.list().get(0);
			System.out.println(d);
			System.out.println("*************");

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}
}
