package com.hibernate.persistence.id;

import java.io.PrintStream;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;

public class CustomerID {
	static String sub, hql2;
	static Object object;

	public static String getNextId() {

		String id = "HCL-15-01";

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			String hql = "from Customer cust";
			Query query = session.createQuery(hql);
			List list = query.list();
			if (list.size() != 0) {
				hql2 = "select max(cust.cid) from Customer cust";
				// do some modification
				query = session.createQuery(hql2);
				object = query.uniqueResult();
				transaction.commit();
				session.close();
				id = String.valueOf(object);
				sub = id.substring(7);
				// "HCL-15-100"
				int x = Integer.parseInt(sub);
				x = x + 1;
				System.out.println(x);
				if (x <= 9) {
					id = "HCL-15-0" + x;
					// "HCL-15-099"
				} else {
					id = "HCL-15-" + x;
					// "HCL-15-099"
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return id;

	}
}
