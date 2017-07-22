package com.hibernate.core;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CIDGenerator {

	public static String getNextCid() {

		Transaction transaction = null;
		String cid = "CID-001";
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure();
			/*
			 * ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
			 * .applySettings(configuration.getProperties())
			 * .buildServiceRegistry();
			 */

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			String query = "from Customer c";
			Query query2 = session.createQuery(query);
			int x = query2.list().size();
			if (x != 0) {

				String query3 = "select max(c.cid) from Customer c";
				Query query4 = session.createQuery(query3);
				Object s1 = query4.list().get(0);
				String s2 = s1 + "";
				String s3 = s2.substring(4);
				try {
					int a = Integer.parseInt(s3);
					a = a + 1;
					if (a <= 9) {
						cid = "CID-00" + a;
					} else if (a <= 99) {
						cid = "CID-0" + a;
					} else {
						cid = "CID-" + a;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return cid;
	}
}
