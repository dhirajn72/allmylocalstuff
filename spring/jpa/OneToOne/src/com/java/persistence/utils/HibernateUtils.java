package com.java.persistence.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.id.uuid.StandardRandomStrategy;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {
	private HibernateUtils() {
		// TODO Auto-generated constructor stub
	}

	private static final SessionFactory SESSION_FACTORY;
	static {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		ServiceRegistry serviceRegistry = serviceRegistryBuilder
				.buildServiceRegistry();
		SESSION_FACTORY = configuration.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
