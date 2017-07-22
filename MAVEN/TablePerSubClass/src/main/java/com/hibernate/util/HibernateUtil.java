package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public static SessionFactory geSessionFactory() {
		return sessionFactory;
	}

}
