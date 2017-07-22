package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();

		ServiceRegistry serviceRegistry = null;
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		serviceRegistryBuilder = serviceRegistryBuilder
				.applySettings(configuration.getProperties());
		serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
