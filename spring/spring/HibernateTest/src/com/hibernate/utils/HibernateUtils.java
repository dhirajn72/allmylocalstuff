package com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {
	private HibernateUtils() {
	}

	private static final SessionFactory SESSION_FACTORY;
	static {
		Configuration configuration = new Configuration();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		ServiceRegistry serviceRegistry = serviceRegistryBuilder
				.buildServiceRegistry();
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
