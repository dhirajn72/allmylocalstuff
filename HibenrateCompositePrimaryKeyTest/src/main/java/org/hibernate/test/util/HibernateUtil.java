package org.hibernate.test.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static private SessionFactory SESSION_FACTORY;

	static {
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure();
			SESSION_FACTORY = configuration.buildSessionFactory();

		} catch (Exception e) {
			System.err.println("Error creating session factory");
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
