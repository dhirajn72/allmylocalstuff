package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory SESSION_FACTORY;
	static {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration = (AnnotationConfiguration) configuration.configure();
		SESSION_FACTORY = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
