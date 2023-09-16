package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session currentSession;
	private static Transaction currentTransaction;

	public static Session openSession() {
		if (currentSession == null || !currentSession.isConnected()) {
			currentSession = getSessionFactory().openSession();
			currentTransaction = currentSession.beginTransaction();
		}
		return currentSession;
	}

	public static void closeCurrentSession() {
		if (currentTransaction != null && !currentTransaction.isActive()) {
			currentSession.flush();
			currentTransaction.commit();
		}
		if (currentSession != null && currentSession.isConnected()) {
			currentSession.close();
		}
	}

	public static void rollbackTransaction() {
		if (currentTransaction != null) {
			currentTransaction.rollback();
		}
	}

	//For JUNIT testing only
	public static void closeSessionFactory() {
		sessionFactory.close();
		sessionFactory = null;
	}
	private static SessionFactory getSessionFactory() {

		// Create the session factory only once it is expensinve
		if (sessionFactory == null) {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());

			sessionFactory = configuration.buildSessionFactory(builder.build());

		}
		return sessionFactory;
	}

}
