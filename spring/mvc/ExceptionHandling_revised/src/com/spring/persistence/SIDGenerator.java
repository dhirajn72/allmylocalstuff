package com.spring.persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SIDGenerator {

	public static String getNextSid() {

		Transaction transaction = null;

		String s = "JLC-001";
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure();
		
			ServiceRegistry serviceRegistry = null;
			ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
			serviceRegistryBuilder = serviceRegistryBuilder.applySettings(configuration.getProperties());
			serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			String query = "select max(stu.cid) from Student";
			Query query2 = session.createQuery(query);
			Object ob = query2.list().get(0);
			System.out.println("OB:" + ob);
			String sid = ob.toString();
			System.out.println("STR" + sid);
			String sub = sid.substring(4);
			int val = Integer.parseInt(sub);
			if (val <= 9) {
				s = "JLC-00" + val;
			} else if (val > 9 && val <= 99) {
				s = "JLC-0" + val;
			} else {
				s = "JLC-" + val;
			}
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return s;
	}
}
