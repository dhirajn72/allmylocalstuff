package com.hibernate.pk;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CustomerId {

	public static String getNextId() {

		String cid = "YASH-1001";
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

				Query query2 = session
						.createQuery("select max(cust.cid) from Customer cust");
				String id = query2.list().get(0).toString();
				System.out.println(id);
				int x = Integer.parseInt(id.substring(5));
				x = x + 1;
				cid = "YASH-" + x;
				System.out.println(cid);
			}
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return cid;
	}
}
