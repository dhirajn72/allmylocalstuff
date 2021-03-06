package com.java.hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private HibernateUtil() {

	}

	private static SessionFactory sessionFactory;
	static {
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration = (AnnotationConfiguration) annotationConfiguration
				.configure();
		sessionFactory = annotationConfiguration.buildSessionFactory();
	}

	public static SessionFactory getsessSessionFactory() {
		return sessionFactory;
	}

}
