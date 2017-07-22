package com.hibernate.pk;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CustomerId {

	public static CustID getNextId() {

		String id = "BG-4";
		String id2 = "1001";
		CustID custID = new CustID(id, id2);
		Transaction transaction = null;
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure();
			StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
			standardServiceRegistryBuilder = standardServiceRegistryBuilder
					.applySettings(configuration.getProperties());
			ServiceRegistry serviceRegistry = standardServiceRegistryBuilder
					.build();
			SessionFactory sessionFactory = configuration
					.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			String querry = "from Customer cust";
			Query query = session.createQuery(querry);
			if (query.list().size() != 0) {
				Query q2 = session.createQuery("select max(id) from Customer");
				int cid = q2.getFirstResult();
				System.out.println(cid);
				// int x = Integer.parseInt(cid.getCid());
				// x = x + 1;
				++cid;
				custID = new CustID(id, String.valueOf(cid));
				System.out.println(id);
			}
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return custID;
	}
}
