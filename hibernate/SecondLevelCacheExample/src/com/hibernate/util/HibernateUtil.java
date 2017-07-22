package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private HibernateUtil() {
		// TODO Auto-generated constructor stub
	}

	private final static SessionFactory SESSION_FACTORY;
	static {
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration = (AnnotationConfiguration) annotationConfiguration
				.configure();
		SESSION_FACTORY = annotationConfiguration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
