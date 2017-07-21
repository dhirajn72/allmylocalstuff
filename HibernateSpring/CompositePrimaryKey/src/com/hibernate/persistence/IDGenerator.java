package com.hibernate.persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class IDGenerator {

	public static CustID getNextID() {
		CustID cid = null;

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration = (AnnotationConfiguration) configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		try {
			String query = "from Customer c";
			List list = session.createQuery(query).list();
			if (list.size() == 0) {
				cid = new CustID("CUST", "001");
			} else {
				String querry = "select max(c.id.cid) from Customer c where  c.id.bid=?";
				Query query2 = session.createQuery(querry);
				query2.setString(0, "CUST");
				List list2 = query2.list();
				String s2 = list2.get(0).toString();
				System.out.println(s2);
				int x = Integer.parseInt(s2);
				x = x + 1;
				if (x <= 9) {
					cid = new CustID("CUST", ("00" + x));
				} else if (x <= 99) {
					cid = new CustID("CUST", ("0" + x));
				} else {
					cid = new CustID("CUST", ("" + x));
				}

			}
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cid;
	}

}
