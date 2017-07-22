package com.java.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private HibernateUtil() {
	}

	private static SessionFactory sessionFactory;
	static {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration =(AnnotationConfiguration) configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
