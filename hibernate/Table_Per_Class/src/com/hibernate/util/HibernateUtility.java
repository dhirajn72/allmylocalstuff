package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtility {

	private static SessionFactory sessionFactory;
	static {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration = (AnnotationConfiguration) configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
