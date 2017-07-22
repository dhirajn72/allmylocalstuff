package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY;
	static {

		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
		standardServiceRegistryBuilder.applySettings(configuration
				.getProperties());
		ServiceRegistry serviceRegistry = standardServiceRegistryBuilder
				.build();
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
