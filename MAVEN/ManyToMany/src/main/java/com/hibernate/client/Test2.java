package com.hibernate.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.ManyToManyTest.Vehicles;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			String hql = "from Vehicles v where v.vmodel=?";
			Query query = session.createQuery(hql);
			query = query.setParameter(0, "V16");
			List<Vehicles> list = (List<Vehicles>) query.list();
			for (Vehicles v : list) {
				System.out.println(v.getCustomers() + " " + v);
			}

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
