package com.java.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private HibernateUtil() {
		// TODO Auto-generated constructor stub
	}

	private static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		ServiceRegistry serviceRegistry = (ServiceRegistry) serviceRegistryBuilder
				.configure().buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
