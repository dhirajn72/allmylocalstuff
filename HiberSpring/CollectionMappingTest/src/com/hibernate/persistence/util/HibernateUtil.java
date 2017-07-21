package com.hibernate.persistence.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;
	static {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
		ServiceRegistry serviceRegistry = standardServiceRegistryBuilder
				.applySettings(configuration.getProperties()).build();
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
